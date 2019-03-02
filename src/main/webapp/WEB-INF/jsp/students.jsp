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
	<a href="/student">Add</a><br>
	<form action="/students" method="get">
			<tr>
			<th>ID</th>
			<th>name</th>
			<%-- <th>sex</th>  --%>
			<%-- <th>grade</th> --%>
			<%-- <th>address</th> --%>
			
		</tr>
		<c:forEach begin="0" end="${fn:length(students) - 1}" var="index">
			<br />
			<tr>
				<td><c:out value="${students[index].id}" /></td>
				<td><c:out value="${students[index].name}" /></td>
				
				<%-- <td><c:out value="${students[index].sex}" /></td> --%>
				<%--<td><c:out value="${students[index].grade}" /></td> --%>
				<%--<td><c:out value="${students[index].address}" /></td> --%>
				
				<td><a href="/students/<c:out value="${students[index].id}" />">edit</a></td>
				<td><a href="/students/delete/<c:out value="${students[index].id}" />">delete</a></td>
				<td><a href="/students/view/<c:out value="${students[index].id}" />">view</a></td>
			</tr>
		</c:forEach>
	</form>
</div>
</table>