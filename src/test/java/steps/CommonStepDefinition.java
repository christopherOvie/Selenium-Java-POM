package steps;

import commonPage.CommonPage;
import io.cucumber.java.en.Then;
import myBase.TestBase;
import org.junit.Assert;
import org.openqa.selenium.By;

public class CommonStepDefinition extends TestBase {

    private CommonPage commonPage;

    public CommonStepDefinition(){
        commonPage = new CommonPage();
    }

    @Then("user confirms page title should be {string}")
    public void userConfirmsPageTitleShouldBe(String title) {


        String i=    commonPage.validatePageTitle();
        System.out.println("title of page is "+i);
        Assert.assertTrue(commonPage.validatePageTitle().contains(title));


    }


}
