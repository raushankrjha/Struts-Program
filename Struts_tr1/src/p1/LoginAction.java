package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.concurrent.ExecutionException;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class LoginAction extends ActionSupport implements ModelDriven,Preparable
{
  LoginPojo pojo;
  Connection con;
  @Override
	public Object getModel() 
    {
	  System.out.println("model method");
	  pojo=new LoginPojo(); 
		return pojo;  
	}
	@Override
	public void prepare() throws Exception 
	{
		System.out.println("prepared method");
	  try
	  {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root","rat");
		
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
		
	}

	
		public String execute()
		{
			System.out.println("execute method");
			int flag=0;
			String query="select * from login";
			try
			{
				PreparedStatement ps=con.prepareStatement(query);
				ResultSet res=ps.executeQuery();
				while(res.next())
				{
				  String userDB=res.getString(1);
				  String passDB=res.getString(2);
				 if(userDB.equals(pojo.getFname())  && passDB.equals(pojo.getPass()))
				 {
					 flag=1;
					 break;
				 }
				}	
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			if(flag==1)
				return SUCCESS;
			else
				return ERROR;
		}
		public String reg()
		{
			int i=0;
			String query="insert into login values(?,?,?)";
			try
			{
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1,pojo.getFname());
			ps.setString(2,pojo.getPass());
			ps.setString(3,pojo.getUsertype());
			i=ps.executeUpdate();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			if(i==0)
			{
		    addActionError("REgistration Failed,Retry");
			return ERROR;
			}
			else
			{
				addActionMessage("Registration Done");
				return SUCCESS;
			}
		}
		
		
		
		
	@Override
		public void validate()
	    {
		System.out.println("validate method called");
		    if(pojo.getFname().length()==0)
		    {
		    	System.out.println("Checking fname");
		     addFieldError("fname","username is blank"); 	
		    }
		    if(pojo.getPass().length()==0)
		    {
		    	System.out.println("Checking pass");
		    addFieldError("pass", "password is blank");
		    }
		}
}
