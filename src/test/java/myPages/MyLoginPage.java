package myPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import myBase.TestBase;

public class MyLoginPage extends TestBase{

	@FindBy(how=How.CSS,using =".zbc-cta-accept > .zbc-cta")
	WebElement  acceptCookiesTab;

	@FindBy(how=How.LINK_TEXT,using ="Sign in")
	WebElement  signInLink;
	
    //initialise the page objects..turn them into WebElements 
	 public MyLoginPage() {
	    	PageFactory.initElements(driver, this);
	    }
	    
	    //Page Actions
	    public void clickAcceptCookiesTab() {
	    	acceptCookiesTab.click();
	    }
	    
public void clickSignInLink(){
	signInLink.click();
}

public String validatePageTitle(){
	return	 driver.getTitle();
}



		@FindBy(how=How.ID,using ="Email")
	WebElement emailText;
	
    @FindBy(how=How.ID,using ="Password")
	WebElement passwordText; 
	  

    @FindBy(how=How.XPATH,using ="//input[@value='Log in']")
	WebElement loginButton;
    

    @FindBy(how=How.LINK_TEXT,using ="Logout")
	WebElement logoutink;
	
    //initialise the page objects..turn them into WebElements 
    
 
    //Page Actions
   
    public void goToURL(String url) {
    	driver.get(url);
    }
    
    public String validateCorrectPageTitle() {
    	return driver.getTitle();
       }
    


    public void click_logoutink() {
    	
    	logoutink.clear();
    }
	
	
}
