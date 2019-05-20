package p1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
public class LoginAction extends ActionSupport implements ModelDriven,Preparable
{
	LoginPojo obj;
	Connection con;
	public Object getModel() 
	{
	    obj=new LoginPojo();
		return obj;//pushing LoginPojo into value stack
		
	}
   public void prepare() throws Exception 
   {
	 try
	 {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","rat");
				
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
   }
   public String registration()
   {
	   String query="insert into login values(?,?,?)";
	   try
	    {
		  PreparedStatement ps=con.prepareStatement(query);
		  ps.setString(1, obj.getFname());
		  ps.setString(2, obj.getPass());
		  ps.setString(3, obj.getType());
		  ps.executeUpdate();
	   }
	   catch (Exception e) 
	   {
		e.printStackTrace();
	   }
	   addActionMessage("Record inserted Successfully");
	   return SUCCESS;
   }
	public String execute()
	{
		String query="select * from login";
		int i=0;
		try
		{
			PreparedStatement ps=con.prepareStatement(query);
			ResultSet res=ps.executeQuery();
			while(res.next())
			{
				String userDB=res.getString(1);
				String passDB=res.getString(2);
				String typeDB=res.getString(3);
				if(obj.getFname().equals(userDB)  && obj.getPass().equals(passDB) && obj.getType().equals(typeDB))
				{
					i=1;
					break;
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		if(i==1)
		{
		  return SUCCESS;	
		}
		else
		{
			addActionError("Wrong Entries,Login Failed ,Retry");
			return ERROR;
		}
		
		
	}	
	@Override
	public void validate() 
	{
	    if(obj.getFname().length()==0)
	    {
	    addFieldError("fname", "Username is blank!");	
	    }
	    if(obj.getPass().length()==0)
	    {
	    	addFieldError("pass", "Password is blank!");
	    }
	    if(obj.getType().length()==0)
	    {
	    	addFieldError("type", "Type is blank!");
	    }
	
	}
	
	
	
	
	
	
	
	
	
}