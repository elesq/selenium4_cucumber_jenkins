package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Base_PO;
import pageObjects.Login_PO;

public class Login_Steps extends Base_PO {
    
    private final Login_PO login_po;

    public Login_Steps(Login_PO login_po) {
        this.login_po = login_po;
    }

    @Given("I access the WebDriver University login page")
    public void i_access_the_web_driver_university_login_page() {
        login_po.navigateToWebDriverUniversityLoginPage();
    }

    @When("I enter a username {word}")
    public void i_enter_a_username(String username) {
        login_po.setUsername(username);
    }

    @When("I enter a password {word}")
    public void i_enter_the_password(String password) {
        login_po.setPassword(password);
    }

    @When("I click on the button")
    public void i_click_on_the_button() {
        login_po.clickLoginButton();
    }

    @Then("I should be presented with an alert with {string}")
    public void i_should_be_presented_with_an_alert_with(String expectedMessage) {
        login_po.waitForAlertAndValidateText(expectedMessage);
    }

}
