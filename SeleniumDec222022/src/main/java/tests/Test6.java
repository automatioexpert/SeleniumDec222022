package tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test6 {

	@Test
	public void m1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.lambdatest.com/");
		System.out.println(driver.findElement(By.cssSelector("div.flex.items-center ")).getText());
		try {
			driver.findElement(By.xpath("//a[contains(text(),'Integrations')]")).click();
		} catch (Exception e) {
			
		}
		System.out.println(driver.findElement(By.cssSelector("div.container div h1")).getText());
		System.out.println(driver.findElement(By.cssSelector("div.container div h1+p")).getText());
		driver.findElement(By.cssSelector("input[placeholder=\"Search Integrations\"]")).sendKeys("GitHub");
		driver.findElement(By.xpath("//*[contains(text(),'Search')]")).click();
		System.out.println("I am the best Expert on the Planet..Thank God");

		driver.quit();
	}
}
