package mypack;

public class MyAction 
{
   String name;
   public String execute()
   {
	   try
	   {
		   Thread.sleep(10000);
	   }
	   catch(Exception e)
	   {
		   System.out.print(e);   
	   }
	   return "success";
   }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

}
