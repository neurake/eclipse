<?php include('partials/menu.php'); ?>
<div class="main">

         <div class="wrapper">
             <h2>update admin</h2>
             <br><br>
             <?php
             //1.get the ID of selected admin
             $id=$_GET['id'];
             //2.create the sql query to get the details
             $sql="SELECT * FROM tbl_admin WHERE id=$id";
             //3. execute the query 
             $res=mysqli_query($conn,$sql);

             //4.check whether the query is executed
             if($res==true)
             {
                 //check whether data is available or not
                 $count= mysqli_num_rows($res);
                 //check whether we have admin data or not
                 if($count==1)
                 {
                     //get the details
                     //echo "Admin Available";
                     $row= mysqli_fetch_assoc($res);

                     $full_name= $row['full_name'];
                     $username= $row['username'];


                 }
                 else{
                     //redirect to the manage-admin page
                     header("location:manage-admin.php"); 
                 }

             }
             else
             {

             }
             
             
             ?>
             <form action="" method="POST">
                
                    <table class="tbl-30">
                      <tr>
                        <td>Full Name:</td>
                        <td>
                            <input type="text" name="full_name" value="<?php echo $full_name; ?>">
                        </td>
                      </tr>
                      <tr>
                        <td>username:</td>
                        <td>
                            <input type="text" name="username" value=" <?php echo $username; ?>">
                        </td>
                      </tr>
                      <tr>
                        <td colspan="2">
                           <input type="hidden" name="id" value="<?php echo $id;?>">
                            <input type="submit" name="submit" value="update admin" class="btn-secondary">
                        </td>
                      </tr>
                    </table>

                
             </form>
         </div>
</div>

<?php

             //check wheather the submit button is clicked or not
             if(isset($_POST['submit']))
             {
               //echo "button clicked";
               //Get all the values from form to update
                $id = $_POST['id'];
                $full_name =$_POST['full_name'];
                $username=$_POST['username'];

                // create sql query to update
                $sql =" UPDATE tbl_admin SET full_name='$full_name',
                username='$username' WHERE id='$id'";

                //execute the query
                $res = mysqli_query($conn,$sql);

                //check whether the query executed or not
                if($res==true)
                {
                  //query executed and admin updated
                  $_SESSION['update'] = "<div class='success'>Admin updated successfully.</div>";
                  //Redirect to Manage Admin Page
                  header('location:manage-admin.php');

                }
                else{
                  //query failed
                  $_SESSION['update'] = "<div class='error'>failed to update admin</div>";
                  //Redirect to Manage Admin Page
                  header('location:manage-admin.php');
                }

             }

?>


<?php include('partials/footer.php'); ?>