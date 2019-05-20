<%@taglib prefix="rat" uri="/struts-tags"%>
<h1>Registration Page</h1>


<rat:form action="reg">
 <font color=green>
      <rat:actionmessage/>
 </font>
<rat:textfield name="fname" label="Enter Username"/>
<rat:password name="pass" label="Enter Password"/>
<rat:textfield name="type" label="Enter Type"/>
 <rat:submit/>
 
</rat:form>
<a href="index.jsp">Login NOW</a>


<html>
<body bgcolor=cyan>
</body>

</html>