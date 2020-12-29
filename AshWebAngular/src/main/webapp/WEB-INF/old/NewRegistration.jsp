<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error{
color:red;
}
</style>


<!--action="SaveRegistration" method="post" modelAttribute="login"-->

</head>
<body>
<h3 align="center">New Registration</h3>
	<form:form>
            <div>
            <table align="center">
                <form:hidden path="id"/>
                <tr>
                        <td>First Name:</td>                                
                        <td><form:input path="Firstname" /></td>
                        <td><form:errors path="Firstname" cssClass="error"/></td>
                </tr>
                <tr>
                        <td>Last Name:</td>                                
                        <td><form:input path="Lastname" /></td>
                        <td><form:errors path="Lastname" cssClass="error"/></td>
                </tr>
                <tr>
                        <td>Address:</td>                                
                        <td><form:input path="address" /></td>
                        <td><form:errors path="address" cssClass="error"/></td>
                </tr>
                <tr>
                        <td>Email ID:</td>                                
                        <td><form:input path="emailid" /></td>
                        <td><form:errors path="emailid" cssClass="error"/></td>
                </tr>
                <tr>
                        <td>Contact No:</td>                                
                        <td><form:input path="contactNo" /></td>
                        <td><form:errors path="contactNo" cssClass="error"/></td>
                </tr>
                <tr>
                        <td>Login Name:</td>                                
                        <td><form:input path="loginname" /></td>
                        <td><form:errors path="loginname" cssClass="error"/></td>
                </tr>
                <tr>
                        <td>Login Password:</td>                                
                        <td><form:input path="loginpassword" /></td>
                        <td><form:errors path="loginpassword" cssClass="error"/></td>
                </tr>
                 <tr>
                    <td colspan="2" align="center"><input type="submit" value="Save"></td>
                </tr>
            </table>
            </form:form>
</body>
</html>