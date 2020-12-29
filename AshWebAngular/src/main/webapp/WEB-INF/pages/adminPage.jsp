<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
 
<html>
<head>
<title>${title}</title>
<script>
    
        function addimage() {
    var img = new Image();
    img.src = "<c:url value="/resources/images/Chrysanthemum.jpg"/>";
    img_home.appendChild(img);
}

</script>
</head>
<body>
    <jsp:include page="menu.jsp" />
 
    <h2>Admin Page</h2>
 
    <h3>Welcome : ${pageContext.request.userPrincipal.name}</h3>
 
    <b>This is protected page!</b>  
</body>
</html>