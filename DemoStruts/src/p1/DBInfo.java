package p1;
import java.sql.*;
public class DBInfo
{
    private static Connection con;
	static
	{
		 try
		 {
		  Class.forName("com.mysql.jdbc.Driver");
		  System.out.println("database driver loaded!!");
		 }
		 catch(ClassNotFoundException e)
		 {
		   e.printStackTrace();
		 }
	}
	public static Connection getConn()
	{
		System.out.println("getConnection method called!!");
		try
		{
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/trngbatch17","root","rat");	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
	public static void close()
	{
		try
		{
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
}