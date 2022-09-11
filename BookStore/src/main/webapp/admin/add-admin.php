<?php include('partials/menu.php'); ?>

 <!---main content section starts-->
 <div class="main">
         <div class="wrapper">
            <h2>Add Admin</h2><br><br>
             <?php
             if(isset($_SESSION['add']))   //checking the session set or not
             {
                echo $_SESSION['add'];     //displaying session that if set
                unset($_SESSION['add']);  //removing session message
             }
             
             ?>
            <form action="" method="POST">

            <table class="tbl-30" >
                <tr>
                    <td>Full Name:</td>
                    <td><input type="text" name="full_name" placeholder="Enter your name"></td>
                </tr>

                <tr>
                    <td>username</td>
                    <td>
                        <input type="text" name="username" placeholder="your username">
                    </td>
                </tr>

                <tr>
                    <td>password</td>
                    <td>
                        <input type="password" name="password" placeholder="your password">
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" name="submit" value="Add Admin" class="btn-secondary">
                    </td>
                </tr>
            </table>

            </form>
         </div>
</div>
<?php include('partials/footer.php'); ?>
<?php
//process the value from the form and save it to the database
//check whether the  submit button is cliked or not
if(isset($_POST['submit']))
{
    //button cliked
    //echo("button cliked");
    //1.Get the data from form
     $full_name=$_POST['full_name'];
     $username=$_POST['username'];
     $password=md5($_POST['password']); //md5 will do encryption of password

     //2.sql query to save the data to the database
     $sql="INSERT INTO tbl_admin SET
     full_name='$full_name',
     username='$username',
     password='$password'
     
     ";
    // echo $sql;  for checking

     //3.executing query and saving data in the database
     $res = mysqli_query($conn,$sql) or die(mysqli_error());

     //4. check whether (query is executed)the data is inserted or not and display message
     if($res==TRUE){
         //data inserted
         //echo "data inserted";
         //create a session variable to display message
         $_SESSION['add']="<div class='success'>Admin Added Successfully</div>";
         //redirect page to manage admin
         header("location:manage-admin.php");  //concatinating
     }
     else{
         // failed to data insertion
         //echo "failed to data insertion";
         //create a session variable to display message
         $_SESSION['add']= "failed to add admin";
         //redirect page to add admin
         header("location:manage-admin.php");   //concatinating
     }




}


//do not require else
//{
//button not cliked
//echo("button not cliked");
//}
?>