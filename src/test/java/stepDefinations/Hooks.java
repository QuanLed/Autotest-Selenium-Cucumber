package stepDefinations;

import Cucumber.AutomationTest082019.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Base{
	
	@Before("@TestNo.2")
	public void BeforeTestLogin() {
		System.out.println("Logout before test login");
		System.out.println(" ");
	}
	
	@After("@TestNo.1")
	public void AfterCreateAccount() {
		System.out.println("You have created successful some new accounts");
		System.out.println(" ");
	}
	
	@After
	public void AfterRunScripts()
	{
		driver.close();
		driver.quit();
	}
	
}
