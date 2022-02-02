package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import myBase.TestBase;

public class Background extends TestBase{


	

	@Before
	public void setUp() {
		TestBase.initialization();
		
	}
	
/*	@After
	public void  tearDown(){
		driver.quit();
	}*/
}
