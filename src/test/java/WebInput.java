import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;
import com.microsoft.playwright.options.AriaRole;

public class WebInput {

    public static void main(String[] args) {
        Browser browser = Playwright
                            .create()
                            .chromium()
                            .launch(new BrowserType.LaunchOptions().setSlowMo(100).setHeadless(false));

        Page page = browser.newPage();
        page.navigate("https://practice.expandtesting.com/inputs");
        page.locator("#input-text").fill("12345");
        page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Display Inputs")).click();
        PlaywrightAssertions.assertThat(page.locator("#output-text")).containsText("989");
    }
}
