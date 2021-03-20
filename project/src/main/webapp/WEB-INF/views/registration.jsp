<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<link href="/styles/login.css" rel="stylesheet" >
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<title>HMS/Register</title>
</head>
<body>
<form action="adduser" method="post">
<div class="form-group">
            <input type="text" class="form-control" name="name" placeholder="Name" required/>
        </div>
        <div class="form-group">
            <input type="text" class="form-control" name="username" placeholder="User Name" required/>
        </div>
        <div class="form-group">
            <input type="password" class="form-control" name="password" placeholder="Password">
         </div>
          <div class="form-group">
            <input type="text" class="form-control" name="country" placeholder="Country" required/>
        </div>
        <div class="form-group">
            <input type="text" class="form-control" name="mobile" placeholder="Phone No" required/>
        </div>
        <div class="form-group">
            <input type="email" class="form-control" name="email" placeholder="Email Address" required/>
        </div>

        
       
<input type="submit" value="Register"><br><br>
</form>
</body>
</html>