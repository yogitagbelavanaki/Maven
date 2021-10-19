package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {

	@Test
	public void loginTest(){
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Log')]")).click();
		driver.findElement(By.className("email")).sendKeys("amazing.detective_genius@gmail.com");
		driver.findElement(By.className("password")).sendKeys("dieHardFan");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		WebElement LogoutButton=driver.findElement(By.xpath("//a[@class='ico-logout']"));
		if(LogoutButton.isDisplayed()){
			System.out.println("User is logged in");
		}
		LogoutButton.click();
		driver.close();
	} 
}
