package p1;

public class LoginPojo 
{
	private String fname,pass,usertype;

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
		System.out.println("usertype is.....................:"+usertype);
	}

	public String getFname() {
		return fname;
	}
	
	public void setFname(String fname) {
		this.fname = fname;
		System.out.println("Fname is.....................:"+fname);
	}
	
	public String getPass() {
		return pass;
	}
	
	public void setPass(String pass) {
		this.pass = pass;
		System.out.println("pass is.....................:"+pass);
	}
  
}
