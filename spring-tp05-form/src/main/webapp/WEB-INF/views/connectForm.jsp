<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Connection Form</title>
</head>
<body>
	<form:form modelAttribute="perso" action="connect" method="post">
		<form:label path="nom">nom</form:label>
		<form:input path="nom" />
		<form:label path="prenom">prénom</form:label>
		<form:input path="prenom" />
		<input type="submit" value="Connexion">
	</form:form>
</body>
</html>