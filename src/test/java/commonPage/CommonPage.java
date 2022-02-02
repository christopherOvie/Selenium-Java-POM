package commonPage;

import myBase.TestBase;
import org.openqa.selenium.support.PageFactory;

public class CommonPage extends TestBase {

    public CommonPage() {
        PageFactory.initElements(driver, this);
    }

public String validatePageTitle(){
     return driver.getTitle();
}

}
