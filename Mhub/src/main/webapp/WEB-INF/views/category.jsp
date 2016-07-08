<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Category</title>
</head>
<body>

<form:form method="POST" action="addcategory">
<table>
<tr>
  <td>Category ID :</td>
           <td><form:input path="Catid" /></td>
        </tr>
     <tr>
        <td>Name :</td>
           <td><form:input path="Name" /></td>
        </tr>
<tr>
        <td>Description :</td>
        <td><form:input path="Description" /></td>
    </tr>
    <tr>
  
    
    <tr>
        <td colspan="2"><input type="submit" value="Add Category"></td>
    </tr>
</table>
</form:form>

</body>
</html>