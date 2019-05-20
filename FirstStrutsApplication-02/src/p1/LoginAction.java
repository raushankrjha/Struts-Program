package p1;
import com.opensymphony.xwork2.ActionSupport;
public class LoginAction extends ActionSupport
{
    private String fname,pass;

	public String getFname() 
	{
		return fname;
	}

	public void setFname(String fname) 
	{
		this.fname = fname;
	}

	public String getPass() 
	{
		return pass;
	}

	public void setPass(String pass) 
	{
		this.pass = pass;
	}
     
	public String execute()
	{
		if(fname.equals(pass))
			return "success";
		else
		{
		    addActionError("Wrong username or password!");
			return "error";
		}
	}	
	@Override
	public void validate() 
	{
	    if(fname.length()==0)
	    {
	    addFieldError("fname", "Username is blank!");	
	    }
	    if(pass.length()==0)
	    {
	    	addFieldError("pass", "Password is blank!");
	    }
	
	}
	
	
	
	
	
	
	
	
	
}