<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>cart details- Septa </title>
    <link rel="stylesheet" href="./css/style.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Noto+Sans:ital,wght@0,400;0,700;1,700&display=swap" rel="stylesheet">
    
</head>
<body>
   
   
    <div class="container">
    <?php include'basic/nav.php' ?>
    </div>

    <!---cart detILAa-->
    <div class="cart-page">
        <table>
            <tr>
                <th>Book</th>
                <th>Quantity</th> 
                <th>Subtotal  </th>

            </tr>
            <tr>
                <td>
                    <div class="cart-info">
                        <img src="images/genda.png" >
                    </div>
                    <div>
                        <p>Red Printed Books</p>
                        <small>Price:$30</small>
                        <a href="">remove</a>
                    </div>
                </td>
                <td> <input type="number" value="1"></td>
                <td>$30</td>
                
            </tr>
            <tr>
                <td>
                    <div class="cart-info">
                        <img src="images/genda.png" >
                    </div>
                    <div>
                        <p>Red Printed Books</p>
                        <small>Price:$30</small>
                        <a href="">remove</a>
                    </div>
                </td>
                <td> <input type="number" value="1"></td>
                <td>$30</td>
                
            </tr>
            <tr>
                <td>
                    <div class="cart-info">
                        <img src="images/genda.png" >
                    </div>
                    <div>
                        <p>Red Printed Books</p>
                        <small>Price:$30</small>
                        <a href="">remove</a>
                    </div>
                </td>
                <td> <input type="number" value="1"></td>
                <td>$30</td>
                
            </tr>
            <tr>
                <td>
                    <div class="cart-info">
                        <img src="images/genda.png" >
                    </div>
                    <div>
                        <p>Red Printed Books</p>
                        <small>Price:$30</small>
                        <a href="">remove</a>
                    </div>
                </td>
                <td> <input type="number" value="1"></td>
                <td>$30</td>
                
            </tr>
        </table>
        <div class="total-price">
            <table>
                <tr>
                    <td>Subtotal</td>
                    <td>$120</td>
                </tr>
                <tr>
                    <td>tax</td>
                    <td>$5</td>
                </tr>
                <tr>
                    <td>total</td>
                    <td>$125</td>
                </tr>
            </table>
        </div>
    </div>

    <!--footer-->
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


</body>
</html>