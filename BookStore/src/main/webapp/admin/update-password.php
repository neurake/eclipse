<?php include('partials/menu.php'); ?>

<div class="main">
         <div class="wrapper">
           <h2>Change Password</h2>
           <br><br>

          <?php
            if(isset($_GET['id']))
            {
              $id=$_GET['id'];

            }
          
           ?>



            <form action="" method="POST">
              <table class="tbl-30">
                <tr>
                  <td>Current Password:</td>
                  <td>
                    <input type="password" name="current_password"  placeholder="Current Password">
                  </td>
                </tr>

                <tr>
                  <td>New Password:</td>
                  <td>
                    <input type="password" name="new_password"  placeholder="New Password">
                  </td>
                </tr>
                <tr>
                  <td>Confirm Password:</td>
                  <td>
                    <input type="password" name="confirm_password"  placeholder="Confirm Password">
                  </td>
                </tr>

                <tr>
                  <td colspan="2">
                    <input type="hidden" name="id" value="<?php echo $id; ?> ">
                    <input type="submit" name="submit" value="Change Password" class="btn-secondary">

                  </td>
                </tr>

              </table>
            </form>



         </div>
</div>

<?php

            //check wheather submit button is clicked or not
            if(isset($_POST['submit']))
            { //echo "clicked";
             // header("location:manage-admin.php");
            
              //1.get data from form
              $id=$_POST['id'];
              $current_password =md5($_POST['current_password']);
              $new_password=md5($_POST['new_password']);
              $confirm_password=md5($_POST['confirm_password']);
              //2. check wheather current passord exists or not
                     $sql = "SELECT * FROM tbl_admin WHERE id=$id AND PASSWORD='$current_password'";
                  //execute query
                  $res=mysqli_query($conn,$sql);

                  if($res==true)
                  {
                    //check whether data is available or not
                    $count=mysqli_num_rows($res);

                    if($count==1)
                    {
                      //user exists and password can be changed
                      echo "user found";
                      header("location:mange-admin.php");
                      //check both pass ar esaame 
                      if($new_password==$confirm_password)
                      {
                        //update pass
                      }
                      else
                      {
                        //redirect to manage admin 
                        $_SESSION['pwd-not-match']="<div class='error'>Password not matched</div>";
                        //redirect the user 
                        header("location:mange-admin.php");
                      }


                    }
                    else
                    {

                      //user  do not exists and reditrect
                      $_SESSION['user-not-found'] ="<div class='error'>user not found. </div>";
                      //redirect user
                      
                      header("location:mange-admin.php");
                      
                    }
                  }
              //3.check wheather the password and confirm match or not
              //4.change password if all above is ok
            }
           




?>
            
<?php include('partials/footer.php'); ?>