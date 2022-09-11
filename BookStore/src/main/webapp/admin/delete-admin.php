<?php

    //include constants.php file
     include('../config/constants.php');

   //1. get the id to be deleted
  $id=$_GET['id'];

   //2.create sql query to delete id
   $sql ="DELETE FROM tbl_admin WHERE id=$id";

   //execute the query
   

   $res = mysqli_query($conn, $sql);
   
   
   //check the query  
   if($res==TRUE)
   {
     //admin deleted successfully
     //echo "admin deleted successfully";
     $_SESSION ['delete']="<div class='success'>Admin deleted successfully</div>";
     //Redirect to manage-admin page
     header("location:manage-admin.php"); 

   }
   else{
     //failed to delete admin
    // echo "admin deletion failed successfully";
    $_SESSION ['delete']="deletion failed successfully";
    header("location:manage-admin.php"); 


   }
   //create session  variable to display message

   //3.redirect to manage-admin to send message(success/error)


?>