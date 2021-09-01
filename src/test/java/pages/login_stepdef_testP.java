package pages;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class login_stepdef_testP {

	private static WebDriver driver;
	loginPage login;
	@Given("google chrome browser is open")
	public void google_chrome_browser_is_open() {
		System.out.println("Testproj__inside__Browser open step");

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\cum_java_se\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	@And("and go to the given url of the site")
	public void and_go_to_the_given_url_of_the_site() {
		driver.get("https://example.testproject.io/web/");
		System.out.println("TestProj__User is on__ given url step");
	}

	@When("^user entered their (.*)and (.*)$")
	public void user_entered_their_username_and_password(String username,String password) throws InterruptedException {
//		loginPage login=new loginPage(driver);
		login=new loginPage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		
//		driver.findElement(By.id("name")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);
		System.out.println("Testproj__User is now entered the username and password");
		Thread.sleep(2000);
	}

	@And("user clicked on the login page of the site")
	public void user_clicked_on_the_login_page_of_the_site() {
		login.clicklogin();
		//driver.findElement(By.id("login")).click();
		System.out.println("TestprojUser is on__ login Page");
	}

	@Then("user is navigated to the homepage of the link given")
	public void user_is_navigated_to_the_homepage_of_the_link_given() {
		login.checklogout();
		//driver.findElement(By.id("logout")).isDisplayed();
		System.out.println("Testproj__User is__ logedd out");
	}

}
