<%@ taglib prefix="rat" uri="/struts-tags"%>


<html>
<h1>Update UserInformation</h1>
<body bgcolor="cyan">
<rat:form action="updateDone">

	 <rat:textfield name="fname" label="Username is:" readonly="true">
	    <rat:param name="value">
	       <rat:property value="#application.id1"/>
	    </rat:param>
	 </rat:textfield>


<rat:textfield name="pass" label="Enter New Password">
	<rat:param name="value">
	  <rat:property value="#application.id2"/>
	</rat:param>
</rat:textfield>

<rat:textfield name="type" label="Enter new UserType">
   <rat:param name="value">
	  <rat:property value="#application.id3"/>
	</rat:param>
</rat:textfield>




<rat:submit/>
</rat:form>









</body>
</html>