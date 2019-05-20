package p1;
import java.util.Enumeration;

import javax.servlet.ServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.opensymphony.xwork2.util.ValueStack;


public class MyInterceptor implements Interceptor 
{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String intercept(ActionInvocation ai) throws Exception 
	{
		
		ValueStack vs=ai.getStack();  //getting valuestack from ActionInvocation
		ServletRequest req=ServletActionContext.getRequest();
		Enumeration<String>  en=req.getParameterNames();
		while(en.hasMoreElements())
		{
			String pname=en.nextElement();
			String pvalue=req.getParameter(pname);
			vs.set(pname,pvalue.toUpperCase());
		}
		
		String str=ai.invoke();
		return str;
		
		
		
		
		
		
		
		
		
		
	}
	

}
