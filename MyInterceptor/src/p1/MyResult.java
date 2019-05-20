package p1;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.Result;

public class MyResult implements Result 
{
  String page;
	public static final String DEFAULT_PARAM="value";
	
	public void setValue(String page)
	{
		this.page=page;
		System.out.println("page is:"+page);
	}
	
	
	
	@Override
	public void execute(ActionInvocation arg0) throws Exception 
	{
		HttpServletRequest req=ServletActionContext.getRequest();
	    HttpServletResponse res=ServletActionContext.getResponse();
	    RequestDispatcher rd=req.getRequestDispatcher(page);
	    rd.forward(req, res);
		
	}
	

}
