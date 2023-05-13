package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import utils.GlobalVars;

public class ContactUs_PO extends Base_PO {

    private @FindBy(xpath = "//input[@name='first_name']")
    WebElement firstNameTextField;

    private @FindBy(xpath = "//input[@name='last_name']")
    WebElement lastNameTextField;

    private @FindBy(xpath = "//input[@name='email']")
    WebElement emailTextField;

    private @FindBy(xpath = "//textarea[@name='message']")
    WebElement textAreaField;

    private @FindBy(xpath = "//input[@value='SUBMIT']")
    WebElement submitButton;

    private @FindBy(xpath = "//div[@id='contact_reply']/h1")
    WebElement successfulSubmission;

    public ContactUs_PO() {
        super();
    }

    public void navigateToWebDriverUniversityContactUsPage() {
        navigateToURL(GlobalVars.WEBDRIVER_UNIVERSITY_BASE_URL + "/Contact-Us/contactus.html");
    }

    public void setUniqueFirstName() {
        sendKeys(firstNameTextField, "AutoFN" + generateRandomNumber(5));
    }

    public void setUniqueLastName() {
        sendKeys(lastNameTextField, "AutoLN" + generateRandomNumber(5));
    }

    public void setUniqueEmail() {
        sendKeys(emailTextField, "AutoEmail" + generateRandomNumber(5) + "@mail.io");
    }

    public void setUniqueComment() {
        sendKeys(textAreaField, "AutoComment: " + generateRandomString(30));
    }

    public void setFirstName(String firstName) {
        sendKeys(firstNameTextField, firstName);
    }

    public void setLastName(String lastName) {
        sendKeys(lastNameTextField, lastName);
    }

    public void setEmail(String email) {
        sendKeys(emailTextField, email);
    }

    public void setComment(String comment) {
        sendKeys(textAreaField, comment);
    }

    public void clickSubmitButton() {
        waitForWebElementAndClick(submitButton);
    }

    public void validateSuccessfulSubmission() {
        waitFor(successfulSubmission);
        Assert.assertEquals(successfulSubmission.getText(), "Thank You for your Message!");
    }
}
