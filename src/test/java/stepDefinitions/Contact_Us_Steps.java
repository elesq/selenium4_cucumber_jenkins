package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.Base_PO;
import pageObjects.ContactUs_PO;

public class Contact_Us_Steps extends Base_PO {

    private final WebDriver driver = getDriver();
    private final ContactUs_PO contactUs_po;

    public Contact_Us_Steps(ContactUs_PO contactUs_po) {
        this.contactUs_po = contactUs_po;
    }

    @Given("I access the WebDriver University contact us page")
    public void i_access_the_web_driver_university_contact_us_page() {
        contactUs_po.navigateToWebDriverUniversityContactUsPage();
    }

    @When("I enter a unique first name")
    public void i_enter_a_unique_first_name() {
        contactUs_po.setUniqueFirstName();
    }

    @And("I enter a unique last name")
    public void i_enter_a_unique_last_name() {
        contactUs_po.setUniqueLastName();
    }

    @And("I enter a unique email address")
    public void i_enter_a_unique_email_address() {
        contactUs_po.setUniqueEmail();
    }

    @And("I enter a unique comment")
    public void i_enter_a_unique_comment() {
        contactUs_po.setUniqueComment();
    }

    @When("I enter a specific first name {word}")
    public void i_enter_a_specific_first_name(String firstName) {
        contactUs_po.setFirstName(firstName);
    }

    @When("I enter a specific last name {word}")
    public void i_enter_a_specific_last_name(String lastName) {
        contactUs_po.setLastName(lastName);
    }

    @When("I enter a specific email address {word}")
    public void i_enter_a_specific_email_address(String email) {
        contactUs_po.setEmail(email);
    }

    @When("I enter a specific comment {string}")
    public void i_enter_a_specific_comment(String comment) {
        contactUs_po.setComment(comment);
    }

    @And("I click on the Submit button")
    public void i_click_on_the_submit_button() {
        contactUs_po.clickSubmitButton();
    }

    @Then("I should be presented with a successful contact us submission message")
    public void i_should_be_presented_with_a_successful_contact_us_submission_message() {
        contactUs_po.validateSuccessfulSubmission();
    }

}
