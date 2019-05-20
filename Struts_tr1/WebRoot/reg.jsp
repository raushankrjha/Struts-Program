<%@ taglib prefix="rat" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'reg.jsp' starting page</title>
    
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
    <h1>New User Registration Form</h1>
    <BR>
    <font color="red"><rat:actionerror/></font>
    <font color="green"><rat:actionmessage/></font>
    <rat:form action="reg">
		    <rat:textfield name="fname" label="Enter username"/>
		    <rat:password name="pass" label="Enter Password"/>
		    <rat:textfield name="usertype" label="Enter usertype"/>
		    <rat:submit/>
    </rat:form>
    <a href="index.jsp">LOGIN NOW</a>
    </center>
  </body>
</html>
