<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
.error {
	color: red;
}
</style>
<title>Person form</title>
</head>
<body>
	Bonjour ${ perso.nom }
	<h1>Person form</h1>
	<form:form modelAttribute="personne" action="personne" method="post">
		<form:label path="nom">nom</form:label>
		<form:input path="nom" />
		<form:errors path="nom" cssClass="error" />
		<br>
		<form:label path="prenom">prénom</form:label>
		<form:input path="prenom" />
		<form:errors path="prenom" cssClass="error" />
		<br>
		<input type="submit" value="Ajouter">
	</form:form>
</body>
</html>