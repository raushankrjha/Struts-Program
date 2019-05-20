<%@ taglib prefix="rat" uri="/struts-tags"%>

<html>
  <body bgcolor=cyan>
   <center>
    <h1>First Struts Application</h1>
    <BR>
    
    <rat:form action="login">
    <rat:textfield name="fname" label="Enter username"/>
    <rat:password name="pass"   label="Enter password"/>
    <rat:submit/>
    </rat:form>
    <BR>
    <a href="reg.jsp">New User</a>
    <a href="Contactus.jsp">ContactUS</a>
   </center>
  </body>
</html>