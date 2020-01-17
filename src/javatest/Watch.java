package javatest;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Watch {
	public static void takepicture(WebDriver driver, String filename) throws Exception{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source= ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File(".//screenshots//"+filename+".png"));
	}
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.in");
		String tab1 =  driver.getWindowHandle();
		Thread.sleep(2000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("watches");
		takepicture(driver,"img1");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
		takepicture(driver,"img2");
		Thread.sleep(2000);
		Actions action=new Actions(driver);
		WebElement watches=driver.findElement(By.cssSelector("img[data-image-index=\"3\"]"));
		action.moveToElement(watches).build().perform();
		watches.click();
		ArrayList<String> tab2 = new ArrayList<String>(driver.getWindowHandles());
		tab2.remove(tab1);
		driver.switchTo().window(tab2.get(0));
		takepicture(driver,"img3");
		
		driver.close();
	}}