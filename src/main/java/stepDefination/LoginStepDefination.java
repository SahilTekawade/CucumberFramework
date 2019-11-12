package stepDefination;


import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefination {

	WebDriver driver;

	@Given("^user should be on freecrm pro login page$")
	public void user_should_be_on_freecrm_pro_login_page() {

		System.setProperty("webdriver.chrome.driver", ".//Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.crmpro.com");
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("CRMPRO"));
	}

	@When("^Enter valid username and Valid user password$")
	public void enter_valid_username_and_Valid_user_password() {

		driver.findElement(By.name("username")).sendKeys("Mayuri_257");
		driver.findElement(By.name("password")).sendKeys("Mayuri$257");

	}

	@Then("^click on submit btn$")
	public void click_on_submit_btn() {
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("^user should be on homepage$")
	public void user_should_be_on_homepage() {
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("CRMPRO"));
		
	}

}
