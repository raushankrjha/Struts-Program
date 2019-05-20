package p1;

public class LoginBean 
{
	private String fname,pass;
    public void setFname(String fname) 
    {
 
		this.fname = fname;
		System.out.println("fname is:"+fname);
	}
    public void setPass(String pass)
    {
		this.pass = pass;
	    System.out.println("pass is:"+pass);
    }
    public String getFname() {
		return fname;
	}
    public String getPass() {
		return pass;
	}

}
