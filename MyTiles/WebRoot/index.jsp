<%@ taglib prefix="s" uri="/struts-tags" %>
<s:form action="login">
<s:textfield name="name" label="Name"/>
<s:password name="password" label="Password"/>
<s:submit value="submit"/>
</s:form>