<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div>${msg}</div>
<table style="width:50%">
<head>
<style>
table, th, td {
  border: 2px solid black;
  border-collapse: collapse;
}
th, td {
  padding: 5px;
}
th, td {
  text-align: center;
}
</style>
</head>
<div class="container">
		<form action="/students/view/{id)" method="get">
<table>
			<tr>
			<th>ID</th>
			<th>name</th>
			<th>sex</th>
			<th>grade</th>
			<th>address</th>
			
		</tr>
			<tr>
				<td><c:out value="${student.id}" /></td>
				<td><c:out value="${student.name}" /></td>
				<td><c:out value="${student.sex}" /></td>
				<td><c:out value="${student.grade}" /></td>
				<td><c:out value="${student.address}" /></td>
				
			</tr>
</table>
	</form>
</div>
