<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Person form</title>
</head>
<body>
	<h1>Person form</h1>
	<form:form modelAttribute="personne" action="personne" method="post">
		<form:label path="nom">nom</form:label>
		<form:input path="nom" />
		<form:label path="prenom">prénom</form:label>
		<form:input path="prenom" />
		<input type="submit" value="Ajouter">
	</form:form>
</body>
</html>