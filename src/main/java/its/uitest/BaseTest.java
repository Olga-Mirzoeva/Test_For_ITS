package its.uitest;

import its.core.initializer.SystemPropertyInitializer;
import its.core.ui.browser.Browser;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

public abstract class BaseTest {
    @BeforeSuite(alwaysRun = true)
    public void initSuite(ITestContext context) {
        SystemPropertyInitializer.initProperties(context);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        Browser.getBrowser().close();
    }
}
