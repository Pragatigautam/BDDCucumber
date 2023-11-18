package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.Assert.assertEquals;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MultipleUsers {
	WebDriver driver;
	@Given("the user is on the Saucedemo login page")
	public void the_user_is_on_the_saucedemo_login_page() {
	    driver = new ChromeDriver();
	    driver.get("https://www.saucedemo.com/v1/");
	}

	@When("the user enters {string} and {string}")
	public void the_user_enters_and(String username, String password) {
	    WebElement Username = driver.findElement(By.id("user-name"));
	   WebElement Password = driver.findElement(By.id("password"));
	   
	   Username.sendKeys(username);
	   Password.sendKeys(password);
	   
	}

	@When("the clicks on the Login button")
	public void the_clicks_on_the_login_button() {
	   WebElement LoginBtn = driver.findElement(By.id("login-button"));
	   LoginBtn.click();
	}
 
	@Then("the user should be {string}")
	public void the_user_should_be(String login_status) {
		if(login_status.equals("successful")) {
			WebElement productsHeader = driver.findElement(By.className("product_label"));
			
			assertEquals("Products", productsHeader.getText());
		}else {
			WebElement errorMsg = driver.findElement(By.cssSelector("h3[data-test=\"error\"]"));
			assertEquals("Epic sadface: Sorry, this user has been locked out.",errorMsg.getText());
		}
		
		driver.quit();
	    
	}

}
