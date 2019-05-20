<%@ taglib prefix="rat" uri="/struts-tags" %>
<html>
<body bgcolor="cyan">
ViewAll.jsp page called

<table border=1>
  <tr>
    <th>Username</th>
    <th>Password</th>
    <th>UserType</th>
    <th>Update</th>
    <th>Delete</th>
  </tr>
  
  
    <rat:iterator value="#application.id">
     <tr>
     <td><rat:property value="fname"/></td>
     <td><rat:property value="pass"/></td>
     <td><rat:property value="type"/></td>
     <td>
       <rat:url id="update" action="updateRecord">
	       <rat:param name="id1" value="fname"/>
	       <rat:param name="id2" value="pass"/>
	       <rat:param name="id3" value="type"/>
       </rat:url>
       <rat:a href="%{update}">Update</rat:a>
     
     </td>
     <td>
        <rat:url id="del" action="delete">
          <rat:param name="id1" value="fname"/>
        </rat:url>
       <rat:a href="%{del}">Delete</rat:a>
     
     
     </td>
     </tr>    
    </rat:iterator>




</table>


</body>
</html>