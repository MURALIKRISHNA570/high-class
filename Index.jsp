<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MOBILE ACCESSIORS</title>
</head>
<body>
 <nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">MOBILE ACCESSIORS</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li><a href="#">LOGIN</a></li>
      <li><a href="#">SIGN UP</a></li>
      <li><a href="#">PRODUCTS</a></li>
    </ul>
  </div>
</nav>
 <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <style>
  .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 70%;
      margin: auto;
  }
  </style>
</head>
<body>

<div class="container">
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>

   <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="1.jpg" width="460" height="345">
      </div>

      <div class="item">
        <img src="3.jpg" width="460" height="345">
      </div>
    <div class="item">
        <img src="4.jpg" width="460" height="345">
      </div>
      <div class="item">
        <img src="5.jpg" width="460" height="345">
      </div>
       <div class="item">
        <img src="6.jpg" width="460" height="345">
      </div>
       <div class="item">
        <img src="7.jpg" width="460" height="345">
      </div>
      
    </div>
    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
<div><a><img src="1.jpg" alt="1" width="200" height="200"/>
</a>
<a><img src="3.jpg" alt="1" width="200" height="200"/>
</a>
<a><img src="4.jpg" alt="1" width="200" height="200"/>
</a>

<a><img src="5.jpg" alt="1" width="200" height="200"/>
</a>
<a><img src="6.jpg" alt="1" width="200" height="200"/>
</a>
<a><img src="7.jpg" alt="1" width="200" height="200"/>
</a>
</div>
 </body>
</html>