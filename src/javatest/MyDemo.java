package javatest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyDemo {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
		LoginPage lp = new LoginPage(driver);
		/*driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Oneplus");
		Thread.sleep(3000);
		for(int i=1;i<3; i++)
		{
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(3000);
		}
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.close();*/
		
	}
	public WebDriver launch() {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.amazon.in");
		return driver;
		
		
	}

}
