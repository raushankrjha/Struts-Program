package p1;
public class LoginAction 
{
    String fname;

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}
    public String execute()
    {
    	return "success";
    }
}
