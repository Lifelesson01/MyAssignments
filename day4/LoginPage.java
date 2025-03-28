package homeassignments.week2.day4;

public class LoginPage extends BasePage{
	
	@Override
	public void performCommonTasks()
	{	
		super.performCommonTasks();  //Explicitly calling parent class method
		System.out.println("Overriding Perform COmmon Tasks ");
	}

	public static void main(String[] args) {

		LoginPage lp=new LoginPage();
		lp.findElement();
		lp.clickElement();
		lp.enterText();
		lp.performCommonTasks();
	}

}
