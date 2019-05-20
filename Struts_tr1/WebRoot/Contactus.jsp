<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Contactus.jsp' starting page</title>
    
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
  <br>
  <table width="900" border="1" align="center">
    <tr>
      <th scope="col">&nbsp;</th>
    </tr>
    <tr>
      <td><div align="center">
        <p>Contact US</p>
        <p>Ur Complete Address  </p>
      </div></td>
    </tr>
    <tr>
      <td><div align="center"><iframe src="https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d3559.007714138432!2d75.79691!3d26.871496!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x396dca04b57eac93%3A0xa505820ddf73e262!2sRAT+Monopoly+In+Java!5e0!3m2!1sen!2sin!4v1406268707277" width="600" height="400" frameborder="0" style="border:0"></iframe></div></td>
    </tr>
    <tr>
      <td><div align="center"><iframe src="https://www.google.com/maps/embed?pb=!1m12!1m8!1m3!1d3559.8221339150155!2d75.802754!3d26.845609!3m2!1i1024!2i768!4f13.1!2m1!1sfortis+hospital%2Cjaipur!5e0!3m2!1sen!2sin!4v1406268919669" width="400" height="300" frameborder="0" style="border:0"></iframe></div></td>
    </tr>
  </table>
  </body>
</html>
