package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	@Test
	public void m1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.lambdatest.com/");
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Holiday Season')]")).getText());

		// Get all footer links

		List<WebElement> links = driver.findElements(By.cssSelector("ul.footer-menu>li"));
		System.out.println("Total links: " + links.size());

		for (WebElement link : links) {
			System.out.println(link.getText());
		}
		driver.quit();
	}
}
