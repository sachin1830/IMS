<%@page import="java.util.Iterator"%>
<%@page import="com.org.model.AccountSearchModel"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>AccountSearchResult</title>
 <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
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
  <a class="navbar-brand ml-4" href="index.html"><img src="logo.png" style="height: 70px; width: 70px;"></a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav ml-5">
      <li class="nav-item active">
        <a class="nav-link " href="StudentDashBoard.html">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item ">
        <a class="nav-link text-white" href="test.html">Payment</a>
      </li>
      <li class="nav-item ">
        <a class="nav-link text-white" href="AddNewAccount.html">AddAccount/DeleteAccount</a>
      </li>
      <li class="nav-item ">
        <a class="nav-link text-white " href="CheckAccount.html">CheckAccount</a>
      </li>
      <li class="nav-item ">
        <a class="nav-link text-white" href="aboutaccountant.html">About</a>
      </li>
      <li class="nav-item ">
        <a class="nav-link text-white" href="contact.html">Contacus</a>
      </li>
    </ul>
  </div>
</nav>
<div>
  <h1 class="text-center mt-3 heading">AccountsSearch</h1>
  <p class="text-center">There is no friend as loyal as a book..</p>
  <hr>
</div>
<div class="row justify-content-center">
  <form class="form-inline" action="" method="post">
    <input class="form-control mr-sm-2" type="search" placeholder="Enter regno." aria-label="Search" name="search">
    <button class="btn btn-outline-primary my-2 my-sm-0" type="submit">Search</button>
  </form>
 </div>
 <%ArrayList<AccountSearchModel>arr=(ArrayList)request.getAttribute("search");
 Iterator list=arr.iterator();
 %>
 <section class="container text-center">
 <%while(list.hasNext()){ AccountSearchModel asm=(AccountSearchModel)list.next(); %>
 <h6 class="text-danger">Registration number:<%out.print(asm.getRegno());%></h6>
 <h6 class="text-danger">peryear amount:<%out.print(asm.getPeryear());%></h6>
 <div class="row mt-3">
		<div class="col-lg-3 col-md-3 col-sm-6 col-6">
			<h5>Firstyear :</h5>
		</div>
		<div class="col-lg-3 col-md-3 col-sm-6 col-6">
		   <h5>secondyear :</h5>
		</div>
		<div class="col-lg-3 col-md-3 col-sm-6 col-6">
		   <h5>Thiredyear :</h5>
		</div>
		<div class="col-lg-3 col-md-3 col-sm-6 col-6">
		   <h5>Fourthyear :</h5>
		</div>
</div>
<div class="row">
		<div class="col-lg-3 col-md-3 col-sm-6 col-6">
			<p><%out.print(asm.getFirstyear()); %></p>
		</div>
		<div class="col-lg-3 col-md-3 col-sm-6 col-6">
		   <p><%out.print(asm.getSecondyear()); %></p>
		</div>
		<div class="col-lg-3 col-md-3 col-sm-6 col-6">
		   <p><%out.print(asm.getThiredyear()); %></p>
		</div>
		<div class="col-lg-3 col-md-3 col-sm-6 col-6">
		   <p><%out.print(asm.getFourthyear()); %></p>
		</div>
	</div>
 <%} %>
 </section>
</body>
</html>