package stepDefinations;

import org.junit.Assert;
import org.junit.runner.RunWith;

import Cucumber.AutomationTest082019.Base;
import cucumber.api.junit.Cucumber;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;

@RunWith(Cucumber.class)
public class CreateAccountingReportContext extends Base {

	LoginPage login = new LoginPage();
	HomePage home = new HomePage();
	
	@Given("^Go to login page$")
    public void go_to_login_page() throws Throwable {
        Base.getDriver();
    }

    @Given("^Go to URL$")
    public void go_to_url() throws Throwable {
        System.out.println("Ban dang o KeiSan Website");
    }

    @When("^Input email \"([^\"]*)\"$")
    public void input_email_something(String strArg1) throws Throwable {
        login.inputEmail(strArg1);
    }

    @When("^Click button Create Business Plan$")
    public void click_button_create_business_plan() throws Throwable {
        throw new PendingException();
    }

    @Then("^Display username \"([^\"]*)\"$")
    public void display_username_something(String strArg1) throws Throwable {
        String real = home.getUserName();
        Assert.assertEquals(null, real, strArg1);
    }

    @Then("^Display message successfull \"([^\"]*)\"$")
    public void display_message_successfull_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^Input password \"([^\"]*)\"$")
    public void input_password_something(String strArg1) throws Throwable {
        login.inputPassword(strArg1);
    }

    @And("^Click button login$")
    public void click_button_login() throws Throwable {
        login.clickLogin();
    }

    @And("^Input Data No \"([^\"]*)\"$")
    public void input_data_no_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^Input Data title \"([^\"]*)\"$")
    public void input_data_title_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^Input Company name \"([^\"]*)\"$")
    public void input_company_name_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^Select business category$")
    public void select_business_category() throws Throwable {
        throw new PendingException();
    }

    @And("^Input Remarks \"([^\"]*)\"$")
    public void input_remarks_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^Select Period unit$")
    public void select_period_unit() throws Throwable {
        throw new PendingException();
    }

    @And("^Input start date of business period \"([^\"]*)\"$")
    public void input_start_date_of_business_period_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^Select currency unit$")
    public void select_currency_unit() throws Throwable {
        throw new PendingException();
    }

    @And("^Input author \"([^\"]*)\"$")
    public void input_author_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^Input Registration date \"([^\"]*)\"$")
    public void input_registration_date_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^Input abstract \"([^\"]*)\"$")
    public void input_abstract_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^Click button save and return$")
    public void click_button_save_and_return() throws Throwable {
        throw new PendingException();
    }

    @And("^Display accounting report with data no \"([^\"]*)\"$")
    public void display_accounting_report_with_data_no_something(String strArg1) throws Throwable {
        throw new PendingException();
    }
}
