<%@taglib prefix="rat" uri="/struts-tags"%>
<h1>First Struts Application</h1>
<html>
<body bgcolor="#FFCCCC">
<rat:form action="login">
 <font color=red>
      <rat:actionerror/>
 </font>
<table width="500" border="0" align="center">
  <tr>
    <td><rat:textfield name="fname" label="Enter Username"/>&nbsp;</td>
  </tr>
  <tr>
    <td><rat:textfield name="type" label="Enter Type"/>&nbsp;</td>
  </tr>
  <tr>
    <td><rat:password name="pass" label="Enter Password"/>&nbsp;</td>
  </tr>
  <tr>
    <td><rat:submit/>&nbsp;</td>
  </tr>
</table>

 
</rat:form>
<a href="Reg.jsp">New Registration</a>
</body>


</html>





 