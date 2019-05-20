package p1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
public class LoginAction  extends ActionSupport implements ModelDriven
{
	LoginBean obj=new LoginBean();
	Connection con;
    @Override
    public Object getModel() 
    {
    	// TODO Auto-generated method stub
    	return obj;
    }
    
    
    @Override
    public String execute()
    {
    	int flag=0;
    	con=DBInfo.getConn();
    	System.out.println("execute method called!!");
    	String query="select * from login where username=? and password=?";
    	try
    	{
    	 PreparedStatement ps=con.prepareStatement(query);
    	 ps.setString(1, obj.getFname());
    	 ps.setString(2, obj.getPass());
    	 ResultSet res=ps.executeQuery();
    	 while(res.next())
    	 {
    		flag=1;
    		 break;
    	 }
    	 
    	 DBInfo.close();
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	if(flag==1)
    	{
    		addActionMessage("Login Done Successfully");
    		 return SUCCESS;
    	}
    	else
    	{
    		addActionError("Login Failed,Retry!!!!!!!!!!");
        	return ERROR;
    	}
    	
    	
   }
    
    @Override
    public void validate() 
    {
    	System.out.println("validate method called!!");
    	  if(obj.getFname().length()==0)
    	  {
    	addFieldError("fname", "Enter username!!");		  
    	  }
    	  if(obj.getPass().length()==0)
    	  {
    		 addFieldError("pass", "Enter password!!");  
    	  }
    }
}
