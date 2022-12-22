package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {

	@Test
	public void m1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.lambdatest.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		System.out.println(driver.findElement(By.cssSelector("img[loading='eager']")).isDisplayed());
		System.out.println(driver.findElement(By.cssSelector("img[alt='google']")).isDisplayed());
		driver.quit();

	}
}
