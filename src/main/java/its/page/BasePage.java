package its.page;

import its.core.ui.browser.Browser;

public abstract class BasePage {
    protected Browser browser;

    public BasePage() {
        browser = Browser.getBrowser();
    }
}
