<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

<%@ taglib prefix="rat" uri="/struts-tags" %>
  </head>
  
  <body>
  <center>
  <font color="red"><rat:actionerror/> </font>
  <h1>registration  Page</h1>
	  <rat:form action="register">
		  <rat:textfield name="fname" label="Enter username"/>
		  <rat:password name="pass" label="Enter password"/>
		  <rat:textfield name="utype" label="Enter usertype"/>
		  
		  <rat:submit/>
	  </rat:form>
  
  </center>
  
  
  
    <br>
  </body>
</html>













