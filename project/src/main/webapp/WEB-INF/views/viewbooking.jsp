<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> --%>
    
 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <h1>View All Booking</h1>
${list} --%>

    <sql:setDataSource
        var="myDS"
        driver="com.mysql.jdbc.Driver"
        url="jdbc:mysql://localhost:3306/hms"
        user="root" password="root"
    />
     
    <sql:query var="listUsers"   dataSource="${myDS}">
        SELECT * FROM booking;
    </sql:query>
     
    <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of Bookings</h2></caption>
            <tr>
                <th>bookingid</th>
                <th>bookingdate</th>
                <th>checkoutdate</th>
                <th>cost</th>
                <th>menudate</th>
                <th> menuid</th>
                <th> paymenttype</th>
                <th> roomnumber</th>
                <th> status</th>
            </tr>
            <c:forEach var="user" items="${listUsers.rows}">
                <tr>
                 <td><c:out value="${user. bookingid}" /></td>
                  <td><c:out value="${user.bookingdate}" /></td>
                   <td><c:out value="${user.checkoutdate}" /></td>
                    <td><c:out value="${user.cost}" /></td>
                     <td><c:out value="${user.menudate}" /></td>
                      <td><c:out value="${user. menuid}" /></td>
                    <td><c:out value="${user. paymenttype}" /></td>
                    <td><c:out value="${user. roomnumber}" /></td>
                    <td><c:out value="${user. status}" /></td>
                </tr>
            </c:forEach>
        </table>
    </div>

</body>
</html>