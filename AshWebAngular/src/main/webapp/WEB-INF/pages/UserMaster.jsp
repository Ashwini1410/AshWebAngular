<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Master</title>
</head>
<body>
	<div align="center">
		<h1>User Master</h1>
		
		<table border="1">

			<th>First name</th>
			<th>Last name</th>
			<th>Address</th>
			<th>Contact No</th>
			<th>Email id</th>

			<c:forEach var="employee" items="${listEmployee}">
				<tr>					
                                    <td>${employee.firstname}</td>
                                    <td>${employee.lastname}</td>
                                    <td>${employee.address}</td>
                                    <td>${employee.contactNo}</td>
                                    <td>${employee.emailid}</td>
                                    <td><a href="edituser?id=${employee.id}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="deleteuser?id=${employee.id}">Delete</a></td>

									
				</tr>
			</c:forEach>
		</table>
		
	</div>
</body>
