package its.uitest;

import its.page.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArloLogInTest extends BaseTest {
    @Test(testName = "testLogIn",
            description = "testLogIn - Test to check the work of site arlo")
    public void testLogIn() {
        final String email = "ananacik@mail.ru";
        final String password = "Olga123#";
        final String expectedMessage = "Two-Step Verification";

        LoginPage loginPage = new LoginPage();
        loginPage.open()
                .clickLogIn()
                .typeEmail(email)
                .typePassword(password)
                .clickSubmit();
        String actualMessage = loginPage.getTextTwoStepVerification();
        Assert.assertEquals(actualMessage, expectedMessage, "Verify message");
    }
}
