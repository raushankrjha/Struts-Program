package p1;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction extends ActionSupport implements ModelDriven
{

	LoginPojo obj=new LoginPojo();
		@Override
		public Object getModel() {
		
			return obj;
		}
		public String execute()
		{
			if(obj.getFname().equals(obj.getPass()))
			{
				addActionMessage(getText("app.valid"));
				return SUCCESS;
			}
			else
			{
				addActionError(getText("app.invalid"));
				return ERROR;
			}
		}
		
		public void validate()
		{
			if(obj.getFname().length()==0)
			{
				addFieldError("fname", getText("app.username.blank"));
			}
			if(obj.getPass().length()==0)
			{
				addFieldError("pass", getText("app.password.blank"));
			}
			
			
		}
}
