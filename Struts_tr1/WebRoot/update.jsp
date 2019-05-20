<%@ taglib prefix="rat" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

  
  <body>
    <center>
    <h1>Update ur info.!</h1>
    <BR>
      <rat:form action="updateDone" >
      <rat:textfield name="fname" label="User Name is:" readonly="true">
		      <rat:param name="value">
		       		<rat:property value="#application.i"/>
		      </rat:param>
      </rat:textfield>
      
      <BR>
      <rat:textfield name="pass" label="NewPassword" >
  		<rat:param name="value">
      		<rat:property value="#application.j"/>
      	</rat:param>
      </rat:textfield>   
    
    
    <BR>
    
    <rat:textfield name="type" label="New Usertype">
    <rat:param name="value">
 
    <rat:property  value="#application.k"/>
    </rat:param>
    
     </rat:textfield>
     
  
     <rat:submit/>
     
     </rat:form>
    
    
    </center>
  </body>
</html>
