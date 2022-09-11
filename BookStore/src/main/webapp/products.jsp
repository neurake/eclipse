<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>All Books - Septa </title>
    <link rel="stylesheet" href="./css/style.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Noto+Sans:ital,wght@0,400;0,700;1,700&display=swap" rel="stylesheet">
    
</head>
<body>
   
   
    <div class="container">
    <?php include'basic/nav.php' ?>
    </div>
</div> 

    
    <div class="small-container">

        <div class="row">
           <h2>All Books</h2>
           <select >
               <option >Default Sorting</option>
               <option >Sort by popularity </option>
               <option >Sort by rating</option>
               <option >Sort by Sales</option>
               <option >Sort by Price </option>
           </select>
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
        <div class="row">
            <div class="col-4">
                <img src="images/genda.png" >
                <h4>Jva script Books</h4>
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
            <div class="col-4">
                <img src="images/genda.png" >
                <h4>C Programming Books</h4>
                <div class="rating"> 
                </div>
                <p>$20.00</p>
            </div>
        </div>
        <div class="row">
            <div class="col-4">
                <img src="images/genda.png" >
                <h4>Jva script Books</h4>
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
            <div class="col-4">
                <img src="images/genda.png" >
                <h4>C Programming Books</h4>
                <div class="rating"> 
                </div>
                <p>$20.00</p>
            </div>
        </div>
        <div class="row">
            <div class="col-4">
                <img src="images/genda.png" >
                <h4>Jva script Books</h4>
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
            <div class="col-4">
                <img src="images/genda.png" >
                <h4>C Programming Books</h4>
                <div class="rating"> 
                </div>
                <p>$20.00</p>
            </div>
        </div>

       <!-- <div class="page-btn">
            <span>1</span>
            <span>1</span>
            <span>2</span>
            <span>3</span>
            <span>4</span>
            <span>&#8594;</span>
        </div>-->

       
        
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