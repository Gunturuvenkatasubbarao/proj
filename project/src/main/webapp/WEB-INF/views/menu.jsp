<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Menu Details</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <
      </head>
<body>
<table class="table table-hover"> 
<form action="adduser1" method="post">
<tr>
<td>MenuId</td>
  <td><input type="text" name="menuid"></td>
  </tr>
  <tr>
  
<td>MenuName</td>
<td> <select id="menuname" name="menuname">
 <option value="Veg">VEG</option>
<option value="Non-Veg">NON-VEG</option>
</tr>
<tr>
<td>Cost</td>
<td> <select id="cost" name="cost">
 <option value="250">250</option>
<option value="400">400</option>
</tr>
<tr>
<td>
<input type="submit" value="Submit"></td>
</tr>
</form>
</table>
</body>
</html>