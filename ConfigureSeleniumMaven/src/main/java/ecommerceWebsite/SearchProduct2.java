package ecommerceWebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchProduct2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashish\\Installer\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();

		WebElement dress = driver.findElement(By.xpath("//input[@id='search_query_top']"));

		dress.sendKeys("Red Dress");

		WebElement search = driver.findElement(By.xpath("(//button[@name='submit_search'])[1]"));

		search.click();

	}

}