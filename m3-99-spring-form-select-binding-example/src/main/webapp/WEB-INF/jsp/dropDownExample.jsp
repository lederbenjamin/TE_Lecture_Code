<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
	<head>
		<title>Drop Down Example</title>
		<style>
			.error {
				color: red;
			}
		</style>
	</head>
	<body>
	<c:url var="handleStateSelectUrl" value="/stateSelect" />
	<form:form action="${handleStateSelectUrl}" method="POST" modelAttribute="selectedState">
		
		<form:select path="state">
	    	<form:options items="${stateList}" />  <%-- Use the key for the Map in the RequestScope --%> 
		</form:select>
		<form:errors path="state" cssClass="error" />
	
	
		<input type="submit" />
	</form:form>
	
	<h1><c:out value="${selectedState.state}" /></h1> 
	
	</body>
</html>