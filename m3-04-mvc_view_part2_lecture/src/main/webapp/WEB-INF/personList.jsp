<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Name List Example</title>
	</head>
	<body>
		<!--  <table> -->
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Age</th>
				<th>Adult</th>
			</tr>
			<c:forEach var="person" items="${personList}">
				<table>	
						<tr>
							<td>${person.firstName}</td>
							<td>${person.lastName}</td>
							<td>${person.age}</td>
							<td>${person.adult}</td>
						</tr>
				</table>
			</c:forEach>
		<!--  </table> -->
	</body>
</html>