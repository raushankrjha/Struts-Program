<%@ taglib prefix="rat" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

  
  <body>
    <center>
    <h1><font color="Green">List of All username & password!</font></h1>
    <BR>
    <h3><font color="red"><rat:actionmessage/></font></h3>
    <table border=1>
     <tr>
      <th>UserName</th>
      <th>Password</th>
      <th>Usertype</th>
      <th>update</th>
      <th>delete</th>
     </tr>
    
    
    
       <rat:iterator value="#application.id">
        <tr>
         <td><rat:property value="fname"/></td>
         <td><rat:property value="pass"/></td>
         <td><rat:property value="usertype"/></td>
         
         <td>
           <rat:url id="update" action="update">
           <rat:param name="id1" value="fname"/>
           <rat:param name="id2" value="pass"/>
           <rat:param name="id3" value="usertype"/>
           
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
    
    <BR>
    
    </center>
  </body>
</html>
