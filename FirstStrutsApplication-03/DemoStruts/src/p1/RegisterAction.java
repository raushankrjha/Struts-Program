package p1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
public class RegisterAction  extends ActionSupport implements ModelDriven,Preparable
{
	RegisterBean obj=new RegisterBean();
    Connection con;
    
	@Override
    public Object getModel() 
    {
		System.out.println("getModel called");
    	return obj;
    }
    @Override
    public void prepare() 
    {
    	System.out.println("prepared called!!");
         con=DBInfo.getConn();
    }
    @Override
    public String execute()
    {
    	System.out.println("execute called!!");
    	int i=0;
    	try
    	{
      String query="insert into login(username,password,usertype) values(?,?,?)";
      PreparedStatement ps=con.prepareStatement(query);
      ps.setString(1, obj.getFname());
      ps.setString(2, obj.getPass());
      ps.setString(3, obj.getUtype());
      i= ps.executeUpdate();
    	DBInfo.close();
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	if(i!=0)
    	{
    		addActionMessage("Registration done !!");
    		return SUCCESS;
    	}
    	else
    	{
    		addActionError("Registration failed!!");
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
    	  if(obj.getUtype().length()==0)
    	  {
    		 addFieldError("utype", "Enter usertype!!");  
    	  }
    }
}
