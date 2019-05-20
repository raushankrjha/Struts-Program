package p1;
public class LoginAction
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
			return "error";
	}	
}