<%@  taglib prefix="rat" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
   <center>
   <b><font color="red"><rat:actionerror/></font></b>
   <b><font color="green"><rat:actionmessage/></font></b>
   <h1><rat:text name="app.welcome"/></h1>
   <rat:form action="login">
   <rat:textfield name="fname" key="app.username"/>
   <rat:textfield name="pass" key="app.password"/>
   <rat:submit/>
   </rat:form>
   
   
   
   
   </center>
  </body>
</html>
