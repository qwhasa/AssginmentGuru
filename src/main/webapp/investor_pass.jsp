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


<div class="row mb-3">
	<div class="col-md-1"></div>
	<div class="col-md-4">
		<h2>Change Password</h2>
		<form action="investor_passchange.jsp" method="post">
			<div class="form-group">
			<label for="email">Enter Email</label>
			<input type="email" class="form-control" name="email" required/>
			</div>
			<div class="form-group">
			<label for="password">Enter New Password</label>
			<input type="password" class="form-control" name="password" required/>
			</div>
			<input type="submit" value="submit" class="btn btn-primary"/>
			
		</form>
	</div>
	<div class="col-md-1"></div>
</div>
</main>
</div>
<%@ include file="footer.jsp" %>


</div>

</body>
</html>
