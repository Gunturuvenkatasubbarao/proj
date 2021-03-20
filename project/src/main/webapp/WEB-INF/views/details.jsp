<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Booking Details</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
      </head>
<body>
<table class="table table-hover"> 
<form action="adduser1" method="post">
<tr>
<td>BookingId</td>
  <td><input type="text" name="bookingid"></td>
  </tr>
  <tr>
<td>RoomNumber</td>
<td>  <input type="text" name="roomnumber"></td>
</tr>
<tr>
<td>BookingDate</td>
<td> <input type="date" name="bookingdate"></td>
</tr>
<tr>

<td>Status</td>
<td>     <input type="text" name="status"></td>
</tr>
<tr>

<td>CheckoutDate</td>
<td><input type="date" name="checkoutdate"></td>
</tr>
<tr>

<td>PaymentType</td>
<td><input type="text" name="paymenttype"></td>
</tr>
<tr>
<td>Cost</td>
<td>       <input type="text" name="cost"></td>
</tr>
<tr>
<td>MenuId</td>
<td>      <input type="number" name="menuid"></td>
</tr>
<tr>
<td>MenuDate</td> 
 <td>  <input type="date" name="menudate"></td>
 </tr>
 <tr>
<td>
<button onclick="myFunction()">Register</button>
</tr>
</form>
<p id="demo"></p>

<script>
function myFunction() {
   
  document.getElementById("demo").innerHTML = " ";
}
</script>
</body>
</html>










