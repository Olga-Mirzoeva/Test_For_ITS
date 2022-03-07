package its.uitest;

import its.page.LoginPage;
import org.testng.annotations.Test;

public class ArloCreateAccountTest extends BaseTest {
    @Test(testName = "testCreateAccount",
            description = "testCreateAccount - Test to check the work of site arlo")
    public void testCreateAccount() {
        final String firstName = "Olga";
        final String lastName = "Mirzoeva";
        final String email = "ananacik@mail.ru";
        final String confirmEmail = "ananacik@mail.ru";
        final String password = "Olga123#";
        final String confirmPassword = "Olga123#";

        LoginPage loginPage = new LoginPage();
        loginPage.open()
                .clickCreateAccount()
                .typeFirstName(firstName)
                .typeLastName(lastName)
                .typeEmail(email)
                .typeConfirmEmail(confirmEmail)
                .typePassword(password)
                .typeConfirmPassword(confirmPassword)
                .clickAgreeCheckbox()
                .clickEnter();
    }
}
