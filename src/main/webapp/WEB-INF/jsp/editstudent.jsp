<div class="container">
	<form action="/students/update/${student.id}" method="post">
		Name:<br> <input type="text" name="name" value="${student.name}"><br>
		sex:<br> <input type="text" name="sex"
			value="${student.sex}"> <br>
		grade:<br> <input
			type="text" name="grade" value="${student.grade}"><br>
		address:<br> <input type="text" name="address"
			value="${student.address}"> <br> <br>
		<input type="submit" value="Save">
	</form>
</div>