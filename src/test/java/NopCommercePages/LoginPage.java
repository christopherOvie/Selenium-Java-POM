package NopCommercePages;

import myBase.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {





    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void goToURL(String url){
       driver.get(url);
   }

    @FindBy(how= How.ID,using ="Email")
    WebElement emailText;

    @FindBy(how=How.ID,using ="Password")
    WebElement passwordText;

    @FindBy(how=How.XPATH,using ="//button[@type='submit']")
    WebElement loginButton;

    @FindBy(how=How.XPATH,using ="//li[contains(text(),'John Smith')]")
    WebElement userNameOnDashboard;

    public void type_On_emailButtonAndPasswordButton(String email,String password) {
        emailText.clear();
        emailText.sendKeys(email);
        passwordText.clear();
        passwordText.sendKeys(password);
    }


    public void clickloginButton(){
        loginButton.click();
    }


//    public String validateCorrectLoggedInUsername(String name){
//      return   userNameOnDashboard.getText();
//    }


}
