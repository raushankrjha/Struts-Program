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
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;

public class ViewAllAction extends ActionSupport implements 
                Preparable,ApplicationAware,ServletRequestAware 
{
	 LoginPojo pojo;
	  Connection con;
	Map<String, Object> map;
	HttpServletRequest req;
	
	
	@Override
	public void setApplication(Map<String, Object> arg0) 
	{
	
		map=arg0;
	}
	
	@Override
	public void setServletRequest(HttpServletRequest arg0) 
	{
	
		req=arg0;
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
		
		public String updateRecord()
		{
			String s1=req.getParameter("id1");
			String s2=req.getParameter("id2");
			String s3=req.getParameter("id3");
			map.put("i", s1);
			map.put("j", s2);
			map.put("k", s3);
			return SUCCESS;
		}
		public String updateDone()
		{
			int i=0;
			String s1=req.getParameter("fname");
			String s2=req.getParameter("pass");
			String s3=req.getParameter("type");
			String query="update login set password=?,usertype=? where username=?";
			try
			{
				PreparedStatement ps=con.prepareStatement(query);
				ps.setString(1,s2);
				ps.setString(2,s3);
				ps.setString(3,s1);
				i=ps.executeUpdate();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			getValue();
			if(i!=0)
			{
				addActionMessage("Record updated successfully!");
				return SUCCESS;
			}
			else
			{
				return ERROR;
			}
				
			
			
			
			
			
			
		}
		
		//to delete a single record
		public String deleteRecord()
		{
			int flag=0;
			String name=req.getParameter("id1");
			String query="delete from login where username=?";
			try
			{
				PreparedStatement ps=con.prepareStatement(query);
				ps.setString(1, name);
				flag=ps.executeUpdate();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			getValue();
			if(flag!=0)
			{
				
				addActionMessage("Record deleted Successfully!");
			return SUCCESS;
			}
			else
			{
				return ERROR;
			}
		}
		
		
		
		
		
		
      public String execute()
      {
    	  getValue();
    	  return SUCCESS;
      }
      public void getValue()
      {
    	  ArrayList<LoginPojo> alist=new ArrayList<LoginPojo>();
    	  String query="select * from login";
    	  
    	  try
    	  {
    		PreparedStatement ps=con.prepareStatement(query);
    		ResultSet res=ps.executeQuery();
    		while(res.next())
    		{
    			String fname=res.getString(1);
    			String pass=res.getString(2);
    			String usertype=res.getString(3);
    		    
    			LoginPojo obj=new LoginPojo();
    		    obj.setFname(fname);
    		    obj.setPass(pass);
    		    obj.setUsertype(usertype);
    		    alist.add(obj);
    		  
    		    
    			
    		}
    	  }
    	  catch(Exception e)
    	  {
    		  e.printStackTrace();
    	  }
    	  
    	  System.out.println("Size of arraylist is:"+alist.size());
    	  map.put("id", alist);
      }
	

	
}
