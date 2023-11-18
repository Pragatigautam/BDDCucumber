package StepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class DashboardSteps{
@Given("the user is on the dashboard page")
public void the_user_is_on_the_dashboard_page() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("Hello");
}

@When("the user enters valid Dusername and Dpassword")
public void the_user_enters_valid_dusername_and_dpassword() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Hello2");
}

@When("clicks on the DLogin button")
public void clicks_on_the_d_login_button() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Hello3");
}

@Then("the user should be navigated to the dashboard")
public void the_user_should_be_navigated_to_the_dashboard() {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Hello4");
}
}
