package Listener;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(CustomListener.class)
public class ScreenshotTest extends Base {
	
	@BeforeMethod
	public void setUp() {
		initialization();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void takeScreenshot() {
		Assert.assertEquals(false,true);
	}
	@Test
	public void testScreenshot2() {
		Assert.assertEquals(false,true);
	}
	@Test
	public void testScreenshot3() {
		Assert.assertEquals(false,true);
	}

}
