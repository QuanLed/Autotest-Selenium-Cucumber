package stepDefinations;

import java.util.List;

import org.junit.runner.RunWith;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination {

//	@Given("^Go to URL$")
//	public void go_to_URL()
//	{
//		System.out.println("Navigate to URL");
//	}
//	
	@When("^Login with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void login_with_username_something_and_password_something(String strArg1, String strArg2) throws Throwable {
		System.out.println("Login success with:");
		System.out.println(strArg1);
		System.out.println(strArg2);
	}
	
	@Then("^Login successful$")
	public void login_successful()
	{
		System.out.println("Validate Homepage");
	}
	
	@And("^Account is displayed$")
	public void account_is_displayed() throws Throwable
	{
		System.out.println("validate account");
		System.out.println(" ");
	}
	
	@When("^Login with username and password with following account$")
    public void login_with_username_and_password_with_following_account(DataTable data) throws Throwable {
		System.out.println("Login success with:");
		List<List<String>> obj=data.raw();
		System.out.println(obj.get(0).get(0));
		System.out.println(obj.get(0).get(1));
		System.out.println(obj.get(1).get(0));
		System.out.println(obj.get(1).get(1));
    }
	
	@When("^Click add new account$")
    public void click_add_new_account() throws Throwable {
		System.out.println("You have clicked Add new account");
    }

    @Then("^Display succession message$")
    public void display_succession_message() throws Throwable {
    	System.out.println("Add account successful");
    	System.out.println(" ");
    }

    @And("^Input (.+) and (.+)$")
    public void input_and(String username, String password) throws Throwable {
    	System.out.println(username);
    	System.out.println(password);
    }
}
