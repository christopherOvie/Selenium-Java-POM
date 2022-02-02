package steps;

import NopCommercePages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import myBase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NopCommerceStepDefinition extends TestBase {


    private   LoginPage loginPage;
    public NopCommerceStepDefinition(){
        loginPage = new LoginPage();

    }


    @Given("user launches the url {string}")
    public void user_launches_the_url(String url) {
     loginPage.goToURL(url);
     System.out.println("the title of page is "+driver.getTitle());
    }
    @Given("user attempts to login by entering  username as {string}  and password as {string}")
    public void user_attempts_to_login_by_entering_username_as_and_password_as(String email, String passwd)throws InterruptedException  {
      loginPage.type_On_emailButtonAndPasswordButton(email,passwd);
      loginPage.clickloginButton();
    }





    @When("the user selects the customer menu")
    public void theUserSelectsTheCustomerMenu() {

    }

    @Given("user is successfully logged into nopcommerce dashboard")
    public void userIsSuccessfullyLoggedIntoNopcommerceDashboard() {
    }

    @And("the user clicks on the Customer")
    public void theUserClicksOnTheCustomer() {
    }

    @And("user clicks on the add new button")
    public void userClicksOnTheAddNewButton() {
    }

    @And("user populate the Customer info")
    public void userPopulateTheCustomerInfo() {
    }

    @When("user  clicks the save button")
    public void userClicksTheSaveButton() {
    }

    @Then("user should see the message {string}")
    public void userShouldSeeTheMessage(String arg0) {
    }

    @Then("user should be able to see the error messages {string}")
    public void userShouldBeAbleToSeeTheErrorMessages(String arg0) {

    }
}
