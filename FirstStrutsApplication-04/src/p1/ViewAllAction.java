package p1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class ViewAllAction extends ActionSupport 
           implements Preparable,ApplicationAware,ServletRequestAware
{
	Connection con;
	Map<String, Object> map;
	HttpServletRequest req;
	public void setApplication(Map<String, Object> arg0) 
	{
	
		map=arg0;
	}
	
	public void setServletRequest(HttpServletRequest arg0) 
	{
	
		req=arg0;
	}
	
	public String update()
	{
		String str1=req.getParameter("id1");
		String str2=req.getParameter("id2");
		String str3=req.getParameter("id3");
		map.put("id1", str1);
		map.put("id2", str2);
		map.put("id3", str3);
		return SUCCESS;
		
	}
	public String updateDone()
	{
		String str1=req.getParameter("fname");
		String str2=req.getParameter("pass");
		String str3=req.getParameter("type");
		String query="update login set password=?,usertype=? where username=?";
		try
		{
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1,str2);
			ps.setString(2,str3);
			ps.setString(3,str1);
			ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		getValue();
		
		return SUCCESS;
	}
	public String delete()
	{
		String name=req.getParameter("id1");
		System.out.println("name is:"+name);
		try
		{
			String query="delete from login where username=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1,name);
			ps.executeUpdate();
		}
		catch (Exception e) 
		{
		   e.printStackTrace();
		}
		getValue();
		return SUCCESS;
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
	public String execute()
	{
	 	getValue();
		return SUCCESS;
	}
	
	public void getValue()
	{
		
		 ArrayList<LoginPojo> al=new ArrayList<LoginPojo>();
		 String query="select * from login";
		 try
		 {
			PreparedStatement ps=con.prepareStatement(query);
			ResultSet res=ps.executeQuery();
			while(res.next())
			{
				String userDB=res.getString(1);
				String passDB=res.getString(2);
				String typeDB=res.getString(3);
				
				LoginPojo pojo=new LoginPojo();
				pojo.setFname(userDB);
				pojo.setPass(passDB);
				pojo.setType(typeDB);
				al.add(pojo);
			}
		 }
		 catch (Exception e) 
		  {
		  e.printStackTrace();
		  }
		  map.put("id", al);
		 System.out.println("Arraylist size is:"+al.size());
	}
	

}















