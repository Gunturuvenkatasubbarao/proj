<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Room Details</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
      </head>
<body>
    <center>
<table class="table table-hover">
<form action="adduser2" method="post">
    <tr>
    <td>Hotelname</td>
    <td> <select id="hotelname" name="hotelname">
<option value=" "></option>
 <option value="surabhi">surabhi</option>
 </select></td>
 </tr>
 <tr>
 <td>Roomnumber</td> 
 <td> <select id="roomnumber" name="roomnumber">
 <option value="01">01</option>
<option value="02">02</option>
<option value="03">03</option>
 <option value="04">04</option>
<option value="05">05</option>
<option value="06">06</option>
</select></td>
 </tr>
 <tr>
     <td>Roomdescription</td>
     <td> <input name="roomdescription" type="text"></td>
</tr>
    <tr>
     <td>Floor</td>
     <td> <select id="floor" name="floor">
 <option value="1st floor">1st floor</option>
<option value="2nd floor">2nd floor</option>
<option value="3rd floor">3rd floor</option>
</select></td>
    </tr>
    <tr>
<td>RoomType</td>
<td><select id="RoomType" name="roomtype">
 <option value="AC">AC</option>
<option value="NON-AC">NON-AC</option>
</select></td>
</tr>
<tr>

 <td>Facility</td>
 <td> <input type="text" name="facility"></td>
 </tr>
 <tr>
 <td>Cost</td>
 <td> <input name="cost" type="text"></td>
 </tr>
 <tr>
     <td>
 <input type="submit" value="Next"></td>
 </tr>
 
 </form>
</table>
</center>
</body>
</html>