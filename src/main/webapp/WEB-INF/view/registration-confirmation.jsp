<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Registration confirmed</h1>
	<h2> Hello ${employeeModel.firstName}
		${employeeModel.lastName}</h2>
		<h3>${employeeModel.department}</h3>
		<ui>
		<c:forEach var="temp" items="${employeeModel.technologies}">
		<li>${temp}</li>
		</c:forEach>
		</ui>
		
		
</body>
</html>