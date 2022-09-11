<?php include('partials/menu.php'); ?>

     <!---main content section starts-->
     <div class="main">
         <div class="wrapper">
           <h2>Manage Admin</h2>
            <br><br>

            <?php
                if(isset($_SESSION['add']))
                {
                    echo $_SESSION['add'];     //displaying message 
                    unset($_SESSION['add']);  //removing session message
                }
                if(isset($_SESSION['delete']))
                {
                    echo $_SESSION['delete'];
                    unset($_SESSION['delete']);
                } 
                
                if(isset($_SESSION['update']))
                {
                    echo $_SESSION['update'];
                    unset($_SESSION['update']);
                }


                if(isset($_SESSION['user-not-found']))
                {
                    echo $_SESSION['user-not-found'];
                    unset($_SESSION['user-not-found']);
                }


            ?>
            <br>
            <br>
            <br>

           <!--button of admin edit-->
           <a href="add-admin.php"class="btn-primary">Add Admin</a><br><br>
            <table class="tbl-full">
                <tr>
                    <th>Sr.No.</th>
                    <th>Full Name</th>
                    <th>username</th>
                    <th>Actions</th>
                </tr>

                <?php
                //query to add get all admin
                $sql = "SELECT * FROM tbl_admin";
                
                //execute the query
                $res =mysqli_query($conn,$sql);

                //check whether query is executed or not

                if($res==TRUE)
                {
                    //count rows to check whether we have data in database or not

                    $count = mysqli_num_rows($res); //function to get all rows in databse

                    $sn=1;   //creating variable for serial number
                    //check no of rows
                    if($count>0)
                    {
                        //we have data in database 
                        while($rows=mysqli_fetch_assoc($res))
                        {
                            //using while loop to get all the data it will execute 
                            //as long as have data

                            //get indivisual data
                            $id=$rows['id'];
                            $full_name=$rows['full_name'];
                            $username=$rows['username'];

                            //Display the values in our table
                            ?>
                                  <tr>
                                      <td><?php echo $sn++ ?>.</td>
                                      <td><?php echo $full_name ?></td>
                                       <td><?php echo $username ?></td>
                                        <td>
                                            <a href="./update-password.php" class="btn-primary" >change password</a>
                                            <a href="./update-admin.php?id=<?php echo $id;?>" class="btn-secondary">update admin</a> 
                                            <a href="./delete-admin.php?id=<?php echo $id ;?>"  class="btn-tertiary">delete admin</a> 
                                        </td>
                                    </tr>




                            <?php

                        }
                    }
                    else{
                        //we do not have data in database 
                    }
                }
                
                
                
                
                ?>





                
            </table>
          
         <div class="clearfix"></div>
         </div>
    
     </div>
     
    <!---main content section ends-->

    <?php include('partials/footer.php'); ?>