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

</head>
<body>
    <div align="center">
<h3 align="center">Login Page</h3>
	<form:form action="loginSuccess" method="post" modelAttribute="login" >
            <div>
            <table align="center">
                <tr>
                        <td>Login Name:</td>                                
                        <td><form:input path="loginname" /></td>
                        <td><form:errors path="loginname" cssClass="error"/></td>
                </tr>
                <tr></tr>
                <tr>
                        <td>Login Password:</td>
                        <td><form:password path="loginpassword"/></td>
                        <td><form:errors path="loginpassword" cssClass="error"/></td>
                </tr>  
                <tr></tr>
                <tr></tr>
                <tr>
                     <td><input type="submit" value="Login"></td>                            
                </tr>
		</table>
                <h4>
			New Register <a href="newRegistration">here</a>
		</h4>
             </div>
	</form:form>
    </div>
</body>
</html>