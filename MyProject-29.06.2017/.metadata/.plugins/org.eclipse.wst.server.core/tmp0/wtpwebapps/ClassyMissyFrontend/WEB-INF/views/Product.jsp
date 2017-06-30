<%@ page language="java" contentType="text/html"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="Header.jsp" %>
<form:form method="POST" action="InsertProduct" modelAttribute="product" enctype="multipart/form-data">

<table align="center">


	<tr>
		<td colspan="2"><center>Product Details</center></td>	
	</tr>
	<tr>
		<td>Product ID</td>
		<td><form:input path="prodid"/></td>
	</tr>
	<tr>
		<td>Product Name</td>
		<td><form:input path="prodname" /></td>
	</tr>
	<tr>
				<td>Category</td>
				<td><form:select path="catid">
						<form:option value="0" label="------Select----" />
						<form:options items="${catlist}" />
					</form:select>
				</td>
			</tr>		
	<tr>
		<td>Supplier</td>
	<td><form:input path="supid"/></td>
	</tr>
	<tr>
	<td>Price</td>
	<td><form:input path="price"/></td>
	</tr>
	<tr>
	<td>Stock</td>
	<td><form:input path="quantity"/></td>
	</tr>
	<tr>
	<td>Product Desc</td>
	<td><form:textarea path="proddesc"/></td>
	</tr>
	<tr>
	<td><input type="submit" /></td>
	</tr> 
	<tr>
			<td>Product Image</td>
			<td><form:input type="file" path="pimage" /></td>
	</tr>
	
	
	</table>
</form:form>

<!-- Displaying the Category data using Table -->
<table cellspacing="2" align="center" border="1">
<tr bgcolor="gray">
<td>Product Id</td>
<td>Product Name</td>
<td>Price</td>
<td>Quantity</td>
<td>Category Id</td>
<td>Supplier Id</td>
<td>Operation</td>
</tr>

<c:forEach items="${prodlist}" var="product">

<tr bgcolor="pink">
<td>${product.prodid}</td>
<td>${product.prodname}</td>
<td>${product.price}</td>
<td>${product.quantity}</td>
<td>${product.catid}</td>
<td>${product.supid}</td>

<td>
<a href="<c:url value="deleteProduct/${product.prodid}"/>">Delete</a>
<a href="<c:url value="updateProduct/${product.prodid}"/>">Update</a>
</td>
</tr>
</c:forEach>
</table>
<!--Completed Displaying Table--->

</body>
</html>


