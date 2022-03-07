package its.page;

import its.core.initializer.SystemProperties;
import its.core.ui.browser.Browser;
import its.core.ui.element.Button;
import its.core.ui.element.Input;
import its.core.ui.element.Text;

import static its.core.ui.element.LocatorType.XPATH;

public class LoginPage extends BasePage {
    private static final String BASE_URL = "https://my.arlo.com/";

    //LOCATORS
    private static final String CREATE_ACCOUNT_BUTTON_XPATH = "//*[@class='basic-link']/a";
    private static final String FIRST_NAME_INPUT_XPATH = "//*[@id='firstName']";
    private static final String LAST_NAME_INPUT_XPATH = "//*[@id='lastName']";
    private static final String EMAIL_INPUT_XPATH = "//*[@id='email']";
    private static final String CONFIRM_EMAIL_INPUT_XPATH = "//*[@id='confirmEmail']";
    private static final String PASSWORD_INPUT_XPATH = "//*[@id='password']";
    private static final String CONFIRM_PASSWORD_INPUT_XPATH = "//*[@id='confirmPassword']";
    private static final String AGREE_CHECKBOX_XPATH =
            "//*[@class='mat-checkbox-inner-container']//*[@id='termsAndConditions-input']/parent::span";
    private static final String ENTER_BUTTON_XPATH = "//*[text()='Continue']";
    private static final String LOG_IN_BUTTON_XPATH = "//*[text()='Log In']";
    private static final String SUBMIT_BUTTON_XPATH = "//*[@type='submit']";
    private static final String TWO_STEP_VERIFICATION_TEXT_XPATH = "//*[text()=' Two-Step Verification ']";

    //ELEMENTS
    private Button createAccountButton = new Button(CREATE_ACCOUNT_BUTTON_XPATH, XPATH);
    private Input firstNameInput = new Input(FIRST_NAME_INPUT_XPATH, XPATH);
    private Input lastNameInput = new Input(LAST_NAME_INPUT_XPATH, XPATH);
    private Input emailInput = new Input(EMAIL_INPUT_XPATH, XPATH);
    private Input confirmEmailInput = new Input(CONFIRM_EMAIL_INPUT_XPATH, XPATH);
    private Input passwordInput = new Input(PASSWORD_INPUT_XPATH, XPATH);
    private Input confirmPasswordInput = new Input(CONFIRM_PASSWORD_INPUT_XPATH, XPATH);
    private Button agreeCheckbox = new Button(AGREE_CHECKBOX_XPATH, XPATH);
    private Button enterButton = new Button(ENTER_BUTTON_XPATH, XPATH);
    private Button logInButton = new Button(LOG_IN_BUTTON_XPATH, XPATH);
    private Button submitButton = new Button(SUBMIT_BUTTON_XPATH, XPATH);
    private Text twoStepVerificationText = new Text(TWO_STEP_VERIFICATION_TEXT_XPATH, XPATH);

    public LoginPage() {
        super();
    }

    public LoginPage open() {
        Browser.getBrowser().open(System.getProperty(SystemProperties.URL.getSystemName()));
        return new LoginPage();
    }

    public LoginPage clickCreateAccount() {
        createAccountButton.click();
        return this;
    }

    public LoginPage typeFirstName(String firstName) {
        firstNameInput.type(firstName);
        return this;
    }

    public LoginPage typeLastName(String lastName) {
        lastNameInput.type(lastName);
        return this;
    }

    public LoginPage typeEmail(String email) {
        emailInput.type(email);
        return this;
    }

    public LoginPage typeConfirmEmail(String confirmEmail) {
        confirmEmailInput.type(confirmEmail);
        return this;
    }

    public LoginPage typePassword(String password) {
        passwordInput.type(password);
        return this;
    }

    public LoginPage typeConfirmPassword(String confirmPassword) {
        confirmPasswordInput.type(confirmPassword);
        return this;
    }

    public LoginPage clickAgreeCheckbox() {
        agreeCheckbox.click();
        return this;
    }

    public LoginPage clickEnter() {
        enterButton.click();
        return this;
    }

    public LoginPage clickLogIn() {
        logInButton.click();
        return this;
    }

    public LoginPage clickSubmit() {
        submitButton.click();
        return this;
    }

    public String getTextTwoStepVerification() {
        return twoStepVerificationText.getText();
    }
}
