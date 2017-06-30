<%@ page language="java" contentType="text/html"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@include file="Header.jsp"%>

<form:form action="InsertUser" modelAttribute="userdetails">
<table align="center">
			<tr>
				<td colspan="2"><center>User Details</center></td>
			</tr>
			<tr>
				<td>User Name</td>
				<td><form:input path="uname" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><form:input path="password" /></td>
			</tr>
			<tr>
				<td>Cust Name</td>
				<td><form:input path="cusname" /></td>
			</tr>
			<tr>
				<td>Role</td>
				<td><form:input path="role" /></td>
			</tr>
			<tr>
				<td>User Email</td>
				<td><form:input path="uemail" /></td>
			</tr>
			<tr>
				<td>User Address</td>
				<td><form:textarea path="uaddr" /></td>
			</tr>
			<tr>
				<td>Mobile Number</td>
				<td><form:textarea path="umobileno" /></td>
			</tr>
			
			<tr>
			<td colspan="2"><input type="submit" /></td>
			</tr>
</table>
</form:form>

<!-- Displaying the Product data using Table -->
<table cellspacing="2" align="center" border="1">

	<tr bgcolor="pink">
		<td>User Name</td>
		<td>Password</td>
		<td>Customer Name</td>
		<td>Role</td>
		<td>Email</td>
		<td>Address</td>
		<td>Mobile Number</td>
		<td>Operation</td>
	</tr>
	<c:forEach items="${userlist}" var="user">
		<tr bgcolor="cyan">
			<td>${userdetails.uname}</td>
			<td>${userdetails.password}</td>
			<td>${userdetails.cusname}</td>
			<td>${userdetails.role}</td>
			<td>${userdetails.uemail}</td>
			<td>${userdetails.uaddr}</td>
			<td>${userdetails.umobileno}</td>
			<td><a href="<c:url value="deleteUserDetails/${userdetails.uname}"/>">Delete</a>
				<a href="<c:url value="updateUserDetails/${userdetails.uname}"/>">Update</a>
			</td>
		</tr>
	</c:forEach>
</table>
<!-- Completed Displaying Table -->

</body>
</html>