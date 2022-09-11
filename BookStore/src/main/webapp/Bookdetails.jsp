<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Books Details- Septa </title>
    <link rel="stylesheet" href="./css/style.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Noto+Sans:ital,wght@0,400;0,700;1,700&display=swap" rel="stylesheet">
    
</head>
<body>
   
   
    <div class="container">
    <?php include'basic/nav.php' ?>
    </div>
    <!--single product details-->

    <div class="single-product">
        <div class="row">
            <div class="col-3">
                <img src="images/genda.png" >
            </div>
            <div class="col-3">
                <p>Home/Eloquent Javascript</p>
                <h1>Eloquent Javascript-A Modern introduction to Programming</h1>
                
                <h4>Author-Marjin Haverbrake</h4>
                <p>Describe your book in simple, 
                    straightforward, and consumer-friendly
                     terms. Your description should be at least
                      150-200 words long. Give readers enough 
                      information to understand what your book 
                      is, what it's about, and if they'll like 
                      it—key factors in deciding whether to buy 
                      your book</p>
                 <h3>$30</h3>     
                <input type="number" value="1">
                <a href=""class="btn">Add To Cart</a>

            </div>
        </div>
    </div>


    
    <div class="small-container">
        <div class="row-2">
            <h2 class="title">Related Books</h2>
        </div>
       
        <div class="row">
            <div class="col-4">
                <img src="images/genda.png" >
                <h4>Jva script Books</h4>
                <div class="rating"> 
                    <!--give rating icon here-->
                </div>
                <p>$20.00</p>
            </div>
            <div class="col-4">
                <img src="images/genda.png" >
                <h4>C Programming Books</h4>
                <div class="rating"> 
                    
                </div>
                <p>$20.00</p>
            </div>
            <div class="col-4">
                <img src="images/genda.png" >
                <h4>C Programming Books</h4>
                <div class="rating"> 
                </div>
                <p>$20.00</p>
            </div>
            <div class="col-4">
                <img src="images/genda.png" >
                <h4>C Programming Books</h4>
                <div class="rating"> 
                </div>
                <p>$20.00</p>
            </div>
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