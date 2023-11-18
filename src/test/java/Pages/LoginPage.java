package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	private WebDriver driver;
	@FindBy(id = "user-name")
	private WebElement userNameInput;
	
	@FindBy (id="password")
	private WebElement passwordInput;
	
	@FindBy (id="login-button")
	private WebElement logInButton;
	
	//creating custructor
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		//defining PageFactory class because we are using initElement which is the method of pagefactory to initialize web elements
		//in pagefactory @FindBy annotation is there
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String username) {
		userNameInput.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		passwordInput.sendKeys(password);
	}
	public void clickLogin() {
		logInButton.click();
	}
}
