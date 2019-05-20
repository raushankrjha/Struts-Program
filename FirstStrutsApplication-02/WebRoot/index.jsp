<%@taglib prefix="rat" uri="/struts-tags"%>
<h1>First Struts Application</h1>


<rat:form action="login">

 <font color=red>
      <rat:actionerror/>
 </font>
<rat:textfield name="fname" label="Enter Username"/>
<rat:password name="pass" label="Enter Password"/>
 <rat:submit/>
</rat:form>
