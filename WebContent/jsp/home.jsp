<%@page import="ServletProject.Kisi"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="ServletProject.ServletHome" %>
    <%@page import="java.util.ArrayList" %>
    <%@page import="java.io.Serializable" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

	<!-- Bootstrap CSS -->
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<link rel="stylesheet" href="css/home.css">
    <title>Socialize</title>
  </head>
  <body>
    
	<nav class="navbar navbar-expand-lg navbar-white bg-white">
		<div class="navbar-collapse collapse w-100 dual-collapse2 order-1 order-md-0">
			<ul class="navbar-nav ml-auto text-center">
				<li class="nav-item">
					<a class="nav-link" href="#">Breeds</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="#">Training</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="#">Date</a>
				</li>
			</ul>
		</div>
		<div class="mx-auto my-2 order-0 order-md-1 position-relative">
			<a class="mx-auto" href="#">
				<img src="images/logo3.jpeg" style="width: 150px; height: 150px;" class="rounded-circle">
			</a>
			<button class="navbar-toggler" type="button" data-toggle="collapse" data-target=".dual-collapse2">
				<span class="navbar-toggler-icon"></span>
			</button>
		</div>
		<div class="navbar-collapse collapse w-100 dual-collapse2 order-2 order-md-2">
			<ul class="navbar-nav mr-auto text-center">
				<li class="nav-item">
					<a class="nav-link" href="#">Profile</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="#">Settings</a>
				</li>
				<li class="nav-item">
					<a class="nav-link" href="servletlogout">Log out</a>
				</li>
			</ul>
		</div>
	</nav>

	<div class="jumbotron">
		<h1 class="display-4">Socialize!</h1>
		<p class="lead">This is a simple site trying find new friendships to your pet. We are interesting with happy pets.</p>
		<hr class="my-4">
		<p>Filter as location, breed or sp. Social pets are happy as fuck.</p>
		<a class="btn btn-light btn-lg" href="#" role="button">View Map</a>
		<a class="btn btn-light btn-lg" href="#" role="button">Filter</a>
	</div>
	
	
	
	<div class="row no-gutters">
	
	<% Integer userCount =  (Integer)request.getAttribute("tid");%>
	<% ArrayList<Kisi> users = (ArrayList<Kisi>)request.getAttribute("list"); %>
	<%for(Integer i = userCount-1 ; i >= 0 ; i-- ){%>
	
	
	<div class="card-group col-xl-3 col-lg-3 col-md-6 col-sm-12 col-xs-12" >		
		<div class="card" >
		  <img src="images/clyde.jpeg" class="card-img-top" alt="...">
		  <div class="card-body">
				<h5 class="card-title"><%= users.get(i).getAd() %></h5>
				<p class="card-text"><%= users.get(i).getEmail() %></p>
				<a href="#" class="btn btn-outline-primary btn-lg" role="button" aria-pressed="true" >Chat</a>
				<a href="#" class="btn btn-outline-success btn-lg" role="button" aria-pressed="true">Like</a>
				<a href="#" class="btn btn-outline-dark btn-lg" role="button" aria-pressed="true">View Profile</a>
			</div>	
			<div class="card-footer text-right">
			<small class="text-muted">in Konak, Izmir.</small>
		  </div>
		</div>
		
	  </div>
	  <% }; %>
	  

<%-- 
	<div class="card-group">
		<div class="card">
		  <img src="images/papagan.jpg" class="card-img-top" alt="...">
		  <div class="card-body">
			<h5 class="card-title">Henry</h5>
			<p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
			<a href="#" class="btn btn-outline-primary btn-lg" role="button" aria-pressed="true">Chat</a>
			<a href="#" class="btn btn-outline-success btn-lg" role="button" aria-pressed="true">Like</a>
			<a href="#" class="btn btn-outline-dark btn-lg" role="button" aria-pressed="true">View Profile</a>
		</div>
		  <div class="card-footer text-right">
			<small class="text-muted">Last updated 3 mins ago</small>
		  </div>
		</div>
		<div class="card">
		  <img src="images/karabas.jpg" class="card-img-top" alt="...">
		  <div class="card-body">
			<h5 class="card-title">Karabas</h5>
			<p class="card-text">This card has supporting text below as a natural lead-in to additional content.</p>
			<a href="#" class="btn btn-outline-primary btn-lg" role="button" aria-pressed="true">Chat</a>
			<a href="#" class="btn btn-outline-success btn-lg" role="button" aria-pressed="true">Like</a>
			<a href="#" class="btn btn-outline-dark btn-lg" role="button" aria-pressed="true">View Profile</a>
		</div>
		  <div class="card-footer text-right">
			<small class="text-muted">Last updated 3 mins ago</small>
		  </div>
		</div>
		<div class="card">
			<img src="images/arap.jpg" class="card-img-top" alt="...">
			<div class="card-body">
			  <h5 class="card-title">Arap</h5>
			  <p class="card-text">Arap is humanist and harmless bird. Supporting text below as a natural lead-in to additional content. This card has even longer content than the first to show that equal height action.</p>
			  <a href="#" class="btn btn-outline-primary btn-lg" role="button" aria-pressed="true">Chat</a>
			  <a href="#" class="btn btn-outline-success btn-lg" role="button" aria-pressed="true">Like</a>
			  <a href="#" class="btn btn-outline-dark btn-lg" role="button" aria-pressed="true">View Profile</a>
		  </div>
			<div class="card-footer text-right">
			  <small class="text-muted">in LA, USA.</small>
			</div>
		  </div>
		
		<div class="card">
		  <img src="images/german.jpg" class="card-img-top" alt="...">
		  <div class="card-body">
			<h5 class="card-title">Bob</h5>
			<p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This card has even longer content than the first to show that equal height action.</p>
			<a href="#" class="btn btn-outline-primary btn-lg" role="button" aria-pressed="true">Chat</a>
			<a href="#" class="btn btn-outline-success btn-lg" role="button" aria-pressed="true">Like</a>
			<a href="#" class="btn btn-outline-dark btn-lg" role="button" aria-pressed="true">View Profile</a>
		</div>
		  <div class="card-footer text-right">
			<small class="text-muted">Last updated 3 mins ago</small>
		  </div>
		</div>
	  </div>
	  
	--%>
	</div>
	
	<!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
   </body>
</html>