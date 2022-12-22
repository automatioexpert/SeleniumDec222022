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

public class Test2 {

	@Test
	public void m1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.lambdatest.com/");
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Holiday Season')]")).getText());
		System.out.println(driver.findElement(By.cssSelector("img[alt='Logo']")).isDisplayed());

		WebElement platform = driver.findElement(By.xpath("//a[contains(text(),'Platform ')]"));
		Actions act = new Actions(driver);
		act.moveToElement(platform).build().perform();
		
		List<WebElement> items=driver.findElements(By.cssSelector("div h3"));
		for(WebElement item:items) {
			System.out.println(item.getText());
		}
		
		driver.quit();

	}
}
