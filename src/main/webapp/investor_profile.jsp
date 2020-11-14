<!doctype html>
<html>
<head>
<title>InvestorGuru - Index Page</title>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
  <link rel="stylesheet" href="css/style.css">
</head>
<body>
<div class="fluid-container">
<!-- header code started -->

<%@ include file="header.jsp"%>

<!-- header code completed -->
<main>
<hr/>
<div>
<%

String msg = (String)session.getAttribute("msg");
String result = (String)session.getAttribute("result");

if(result!=null){
	if(result.equals("success")){
		%>
			<div class="alert alert-success alert-dismissible col-md-6 ml-5">
			  <button type="button" class="close" data-dismiss="alert">&times;</button>
			  <strong> Success! </strong> <%= msg %>
			</div>
		<%
	}
	else{
		%>
			<div class="alert alert-danger alert-dismissible col-md-6 ml-5">
			  <button type="button" class="close" data-dismiss="alert">&times;</button>
			  <strong>Failed!</strong> <%= msg %>
			</div>
		<%
		
	}
}
%>
</div>
<div class="row mb-3">
	<div class="col-md-1"></div>
	<div class="col-md-4">
		<h2>Update profile Here</h2>
		<form action="investor_profchange.jsp" method="post">
			<div class="form-group">
			<label for="email">Enter Email</label>
			<input type="email" class="form-control" name="email"/>
			</div>
			<div class="form-group">
			<label for="name">Enter New Name</label>
			<input type="text" class="form-control" name="name"/>
			</div>
			<div class="form-group">
			<label for="mobile">Enter New Mobile</label>
			<input type="number" class="form-control" name="mobile"/>
			</div>
			<input type="submit" value="submit" class="btn btn-primary"/>
			
		</form>
	</div>
	<div class="col-md-1"></div>
	<div class="col-md-4">
	
	</div>
	<div class="col-md-1"></div>
</div>

</main>

<footer>
<p>&copy; 2020 All Rights Reserded</p>
</footer>


</div>

</body>
</html>
