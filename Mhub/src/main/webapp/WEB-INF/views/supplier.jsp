<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Category</title>
</head>
<body>

<form:form method="POST" action="addsupplier">
<table>
<tr>
  <td>Supplier ID :</td>
           <td><form:input path="Supid" /></td>
        </tr>
     <tr>
        <td>Supplier Name :</td>
           <td><form:input path="Name" /></td>
        </tr>
<tr>
        <td>Address :</td>
        <td><form:input path="Address" /></td>
    </tr>
    <tr>
  
        <td colspan="2"><input type="submit" value="Add Supplier"></td>
    </tr>
</table>
</form:form>

</body>
</html>