package myBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
 public static WebDriver driver;
	    public	static Properties prop;
	    //create constructor to read the base class
	    public TestBase() {   

	        try {
	            prop = new Properties();

	            FileInputStream ip = new FileInputStream("src/main/java/config/config.properties");
	            prop.load(ip);
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
    }
	    	
	     public static void initialization() {
				//var _testbase = new TestBase();
			 var _testbase = new TestBase();
			   String browserName=	_testbase.prop.getProperty("browser");
		        if(browserName.equals("chrome")) {
		        // System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "//Driver/chromedriver.exe");
		            driver= new ChromeDriver();
		        }

		        else if (browserName.equals("Firefox")) {
		            System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"Driver/geckodriver.exe");
		           
		            driver= new FirefoxDriver();
		        }
		        driver.manage().window().maximize();
		        driver.manage().deleteAllCookies();
		        driver.get(prop.getProperty("url"));
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		        driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		       // driver.get(prop.getProperty("URL"));
		       
		   }
}
