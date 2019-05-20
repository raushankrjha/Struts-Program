package p1;

public class RegisterBean 
{
	private String fname,pass,utype;
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
    
    public void setUtype(String utype) {
		this.utype = utype;
		System.out.println("usertype is:"+utype);
	}
    public String getUtype() {
		return utype;
	}
    public String getFname() {
		return fname;
	}
    public String getPass() {
		return pass;
	}

}
