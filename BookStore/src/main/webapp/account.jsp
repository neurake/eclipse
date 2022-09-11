<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Account details- Septa </title>
    <link rel="stylesheet" href="./css/style.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Noto+Sans:ital,wght@0,400;0,700;1,700&display=swap" rel="stylesheet">
    
</head>
<body>
   
   
    <div class="container">
    <?php include'basic/nav.php' ?>
    </div>
    <!-------Account Page -->
    <div class="account-page">
        <div class="container">
            <div class="row">
                <div class="col-2">
                    <img src="images/image1.png" width="100%">
                </div>

                <div class="col-2">
                    <div class="form-container">
                        <div class="form-btn">
                            <span onclick="Login()">Log in</span>
                            <span onclick="Register()">Register</span>
                            <hr id="Indicator">
                        </div>
                        <form id="LoginForm" >
                            <input type="text" placeholder="Username">
                            <input type="password" placeholder="password">
                            <button type="submit" class="btn">Log in</button>
                            <a href="">Forgot password</a>
                        </form>

                        <form id="RgForm">
                            <input type="text" placeholder="Username">
                            <input type="email" placeholder="email">
                            <input type="number" placeholder="mobile">
                            <input type="password" placeholder="password">
                            <button type="submit" class="btn">Registration</button>
                            <a href="">Forgot password</a>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- footer -->

    <?php include'basic/footer.php' ?>
    <!-----js for toggle menu ------->
    <script>
        var MenuItems =document.getElementById("MenuItems");
        MenuItems.style.maxHeight ="0px";
        function menutoggle(){
            if(MenuItems.style.maxHeight =="0px")
            {
                MenuItems.style.maxHeight="200px";
            }
            else
                {
                    MenuItems.style.maxHeight="0px";
                 }
        }
    </script>

    <!-----js for toggle form ------->
    <script>
        var LoginForm=document.getElementById("LoginForm");
        var RgForm=document.getElementById("RgForm");
        var Indicator=document.getElementById("Indicator");
        function Register(){
            RgForm.style.transform ="translateX(0px)";
            LoginForm.style.transform="translateX(0px)";
            Indicator.style.transform="translateX(100px)";
        }
        function Login(){
            RgForm.style.transform="translateX(300px)";
            LoginForm.style.transform="translateX(300px)";
            Indicator.style.transform="translateX(0px)";
        }
    </script>


</body>
</html>