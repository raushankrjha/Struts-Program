<%@ taglib prefix="rat" uri="/struts-tags"%>
<html>

<body bgcolor=cyan>


<rat:actionmessage/>
Hello : <rat:property value="fname"/>

<rat:form action="viewAll">
<rat:submit  value="View All username and password"/>
</rat:form>

</body>
</html>
