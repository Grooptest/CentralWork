package Listener;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public static WebDriver driver;

	public static void initialization() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashish\\Installer\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://alpineherb.ca/");
		driver.manage().window().maximize();
	}

	public void failed(String testMethodName) {

		File scrfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrfile,
					new File("C:\\Users\\Ashish\\git\\CentralWork\\ConfigureSeleniumMaven\\Screenshots\\" + testMethodName ));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
