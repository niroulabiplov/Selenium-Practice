package guruTutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTutorial {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\jdk-14.0.2\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		driver.findElement(By.name("firstName")).sendKeys("Biplov");
		
		driver.findElement(By.name("lastName")).sendKeys("Niroula");
		
		driver.findElement(By.name("phone")).sendKeys("9860821078");
		
		driver.findElement(By.name("userName")).sendKeys("niroula.niroula@gmail.com");
		
		driver.findElement(By.name("address1")).sendKeys("Sukedhara");
		
		
		driver.findElement(By.name("address1")).sendKeys("Sukedhara");
		
		driver.findElement(By.name("city")).sendKeys("Kathmandu");
		
		driver.findElement(By.name("state")).sendKeys("Bagmati");
		
		driver.findElement(By.name("postalCode")).sendKeys("009777");
		
		Select sel1=new Select(driver.findElement(By.name("country")));
		sel1.selectByValue("NEPAL");
		
		driver.findElement(By.name("email")).sendKeys("niroula.niroula@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("Bagmati123");
		
		driver.findElement(By.name("confirmPassword")).sendKeys("Bagmati123");
		
		driver.findElement(By.name("submit")).click();
		
		
		//driver.findElement(By.cssSelector("a[title='Go to Facebook Home']")).click();
		
		/*if(driver.getTitle().equals("Facebook - Log In or Sign Up")){
			System.out.println("Welcome to facebook HomePage");
		}
		else
		{
			System.out.println("Sorry! You are not in Home Page");
		}*/
		//driver.close();

	}

}
