package javatest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;
	public LoginPage(WebDriver driver2) {
		driver=driver2;
	}
	private By username=By.className("userName");
	private By password=By.className("password");
	private By signinbtn=By.className("login");
	
	private void setUsername() {
		driver.findElement(username).sendKeys("mercury");
	}
	private void setPassword() {
		driver.findElement(password).sendKeys("mercury");
	}
	private void clickOnSignin() {
		driver.findElement(signinbtn).click();
	}
	public void login() {
		this.setUsername();
		this.setPassword();
		this.clickOnSignin();
	}

	}
