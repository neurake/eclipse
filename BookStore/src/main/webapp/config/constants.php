<?php
  //start session

  session_start();




//create constants for non repeating values
define('SITEURL','localhost/bookstore/');
define('LOCALHOST','localhost');
define('DB_USERNAME','root');
define('DB_PASSWORD','');
define('DB_NAME','bookstore');


//3.execute query and save data in the database
$conn =mysqli_connect('localhost','root','') or die(mysqli_error()); //connect the database
//username is root and password is blank
$db_select =mysqli_select_db($conn,'bookshelf')or die(mysqli_error());   //selecting databasse 
//food-order is dbname




?>