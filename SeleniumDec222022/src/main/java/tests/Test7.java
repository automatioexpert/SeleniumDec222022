package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test7 {

	@Test
	public void m1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.lambdatest.com/");
		driver.findElement(By.cssSelector("a[href*='pricing']")).click();
		System.out.println(driver.findElement(By.cssSelector("div#pricing_header>div>h1")).getText());
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Free')]")).getText());
		driver.quit();
		
	}
}
