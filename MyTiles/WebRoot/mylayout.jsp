<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="rat"%>
<html>
   <head>
   <title> <rat:getAsString name="title"/></title>
   </head>
   <body>
   <table width="100%" height="100%" border="1" bgcolor="#cococo">
   <tr>
   <td width="100%" height="10%">
   <rat:insertAttribute name="header"/>
   </td>
   
   </tr>
   <tr>
   
   <td width="100%" height="80%">
   <rat:insertAttribute name="contents"/>
   </td>
   
   </tr>
   
   <tr>
   
   <td width="100%" height="10%">
   <tiles:insertAttribute name="footer"/>
   </td>
   
   </tr>
   </table>
   </body>
   </html>
