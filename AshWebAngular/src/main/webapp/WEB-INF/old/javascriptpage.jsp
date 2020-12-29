<%@page contentType="text/html" pageEncoding="windows-1252"%>
<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html

<!DOCTYPE html>
<html lang="en">
<head>
    <link href="<c:url value="/resources/cssfile/newcss.css" />" rel="stylesheet">
</head>

<body onload="square(4)">    
<h1>1. Tests CSS</h1>
<h1>Welcome to ${message} </h1>
<h2>2. Test JS</h2>
<div id="msg"></div>
<p id="demo"></p>
 
<input type="button" value="click" onclick="msg()"/>  

<script src="<c:url value="/resources/scriptfile/script.js"/>"></script>
<!--
<script>
    var s = square(4);
    document.getElementById("demo").value = s;

</script>
-->
</body>
</html>
