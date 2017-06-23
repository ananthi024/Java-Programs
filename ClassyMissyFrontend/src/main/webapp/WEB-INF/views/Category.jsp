<%@ page language="java" contentType="text/html"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@include file="Header.jsp" %>

<!-- Category Form Started -->
<form action="AddCategory" method="post">
<table align="center" cellspacing="2">
	<tr>
		<td colspan="2">Category Details</td>
	</tr>
	<tr>
	<td>Category Name</td>
	<td><input type="text" name="catname"/></td>
	</tr>
	<tr>
	<td>Category Description</td>
	<td><input type="text" name="catdesc"/></td>
	</tr>
	<tr>
	<td colspan="2">
		<input type="submit" value="AddCategory"/>
	</td>
	</tr>
</table>
</form>
<!-- Category Form Completed -->

<table cellspacing="2" align="center">
<tr>
<td>Category Id</td>
<td>Category Name</td>
<td>Category Desc</td>
<td>Operation</td>
</tr>
<c:forEach items="${catdetail}" var="category">
<tr>
<td>${category.catid}</td>
<td>${category.catname}</td>
<td>${category.catdesc}</td>

</tr>
</c:forEach>
</table>


</body>
</html>