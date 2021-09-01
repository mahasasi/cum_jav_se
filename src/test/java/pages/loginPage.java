package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	
	WebDriver driver;

	By txt_username= By.id("name");
	By txt_password= By.id("password");
	By txt_login= By.id("login");
	By txt_logout=By.id("logout");
	
	public loginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);		
	}
	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);		
	}
	public void clicklogin() {
		driver.findElement(txt_login).click();		
	}
	public void checklogout() {
		driver.findElement(txt_logout).isDisplayed();		
	}
}
