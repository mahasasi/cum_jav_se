package google_step_def;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class google_login_step_def {

	private static WebDriver driver;

	@Given("google browser is open")
	public void google_browser_is_open() {
		System.out.println("inside__Browser open step");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\cum_java_se\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}

	@And("and go to the given url")
	public void and_go_to_the_given_url() {
		driver.get("https://example.testproject.io/web/");
		System.out.println("User is on__ given url step");

	}

	@When("^user entered the (.*) and (.*)$")
	public void user_entered_the_username_and_password(String username,String password) throws InterruptedException{
		driver.findElement(By.id("name")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);

		System.out.println("User is now entered the username and password");
		Thread.sleep(2000);
	}

	@And("user clicked on the login page")
	public void user_clicked_on_the_login_page() {
		driver.findElement(By.id("login")).click();
		System.out.println("User is on__ login Page");

	}

	@Then("user is navigated to the homepage of that link")
	public void user_is_navigated_to_the_homepage_of_that_link() {
		driver.findElement(By.id("logout")).isDisplayed();
		System.out.println("User is__ logedd out");
	}

}
