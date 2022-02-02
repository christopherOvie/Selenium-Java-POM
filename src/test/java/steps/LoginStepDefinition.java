package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myBase.TestBase;
import myPages.MyLoginPage;

public class LoginStepDefinition extends TestBase {
	
	private	MyLoginPage myLoginPage;

	
		public LoginStepDefinition() {
		myLoginPage = new MyLoginPage();

		
	}
	
	@Given("user goes to car Guide Home page")
	public void user_goes_to_car_guide_home_page() throws InterruptedException {

	String title=	myLoginPage.validatePageTitle();

		System.out.println(title);
		}
  
	@Given("user accepts the cookies")
	public void user_accepts_the_cookies() {
		myLoginPage.clickAcceptCookiesTab();
		}
	
	
    @When("user launches the application url {string}")
	public void user_launches_the_application_url(String url) throws InterruptedException {
    System.out.println("title of current page is "+myLoginPage.validateCorrectPageTitle());
    	
    }
    @Given("user clicks sign in link")
   public void user_clicks_sign_in_link() {
  // 	myLoginPage.clickAcceptCookiesTab();
		myLoginPage.clickSignInLink();
   }
   
//    @Given("user attempts to login by entering  username as {string}  and password as {string}")
//    public void user_attempts_to_login_by_entering_username_as_and_password_as(String email, String passwd) {
//
//    	//myLoginPage.type_On_emailButtonAndPasswordButton(email, passwd);
//    }


	@Then("the title of the page should be {string}")
	public void the_title_of_the_page_should_be(String string) {
	    
	}

	@When("user attempt to log out")
	public void user_attempt_to_log_out() {
	    
	}
}
