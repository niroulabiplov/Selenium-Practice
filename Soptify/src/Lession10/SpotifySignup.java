package Lession10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpotifySignup {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\jdk-14.0.2\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spotify.com/us/signup/");
		
		driver.findElement(By.id("email")).sendKeys("biplovniroula@gmail.com");
		
		driver.findElement(By.id("confirm")).sendKeys("biplovniroula@gmail.com");
		
		driver.findElement(By.id("password")).sendKeys("biplovniroula@123");
		
		driver.findElement(By.id("displayname")).sendKeys("Biplov");
		
		Select s1=new Select(driver.findElement(By.id("month")));
		s1.selectByValue("12");
		
		driver.findElement(By.id("day")).sendKeys("13");
		
		driver.findElement(By.id("year")).sendKeys("1990");
		
		//driver.findElement(By.className("VisuallyHidden-sc-16hiv4t-0 gUnBy")).click();
		
		if (driver.findElement(By.className("Indicator-sc-16vj7o8-0 kSKYRE")).getAttribute("value").matches("male"))
{
	driver.findElement(By.className("Indicator-sc-16vj7o8-0 kSKYRE")).click();
	}
		
		//driver.close();
	}

}
