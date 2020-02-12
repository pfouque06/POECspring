<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/file.css">
<title>first jsp called by controller</title>
</head>
<body>
	<h1>first jsp called by controller</h1>
	<span class="first">
	my name is ${prenom } ${nom }
	</span>
</body>
</html>
