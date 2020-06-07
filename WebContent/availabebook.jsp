<%@page import="java.util.Iterator"%>
<%@page import="com.org.model.AvailableBookModel"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>AvailabeBooks</title>
<meta charset="utf-8">
   <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<script src="https://kit.fontawesome.com/08bfd4d6f5.js" crossorigin="anonymous"></script>
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link href="https://fonts.googleapis.com/css?family=Lora&display=swap" rel="stylesheet">
</head>
<body>
<nav class="navbar navbar-expand-lg  navbar-dark bg-primary sticky-top">
  <a class="navbar-brand ml-4" href="#"><img src="image/logo.png" style="height: 70px; width: 70px;"></a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav ml-5">
       <li class="nav-item active">
        <a class="nav-link " href="index.html">Home <span class="sr-only">(current)</span></a>
      </li>
       
      <li class="nav-item ">
        <a class="nav-link text-white" href="#">About</a>
      </li>
      <li class="nav-item ">
        <a class="nav-link text-white" href="#">Contacus</a>
      </li>
    </ul>
  </div>
</nav>
<div>
  <h1 class="text-center mt-3 heading">Available Books</h1>
  <p class="text-center">There is no friend as loyal as a book..</p>
  <hr>
</div>
<!-------------------------- availabe books---------------------------------------------------------->
<div class="row justify-content-center">
  <form class="form-inline" action="SearchController" method="post">
    <input class="form-control mr-sm-2" type="search" placeholder="Enter name of the book" aria-label="Search" name="search">
    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
  </form>
</div>
 <%ArrayList<AvailableBookModel> arr=(ArrayList)request.getAttribute("result"); 
 Iterator list=arr.iterator();
 %>
 <!-- Heading -->
 <section class="container">
		<section class="row">
			<div class="col-lg-3 col-md-3 col-sm-6 col-6">
				<h3>Bookid</h3>
			</div>
			<div class="col-lg-3 col-md-3 col-sm-6 col-6">
				<h3>Bookname</h3>
			</div>
			<div class="col-lg-3 col-md-3 col-sm-6 col-6">
				<h3>BookAuthor </h3>
			</div>
			<div class="col-lg-3 col-md-3 col-sm-6 col-6">
				<h3>BookPublisher</h3>
			</div>
		</section>
</section>
 <%while(list.hasNext()) { AvailableBookModel ab=(AvailableBookModel)list.next();%>
  <section class="container">
	<section class="row mt-3">
		<div class="col-lg-3 col-md-3 col-sm-6 col-6">
			<p><%out.print(ab.getBookid()) ;%></p>
		</div>
		<div class="col-lg-3 col-md-3 col-sm-6 col-6">
			<p><%out.print(ab.getBookname()) ;%></p>
		</div>
		<div class="col-lg-3 col-md-3 col-sm-6 col-6">
			<p><%out.print(ab.getBookauter()) ;%></p>
		</div>
		<div class="col-lg-3 col-sm-3 col-md-6 col-6">
			<p><%out.print(ab.getBookpublisher());%></p>
		</div>
	</section>
	<hr>
	</section>
 <%}%>
</body>
</html>