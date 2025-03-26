import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class RadioCheckBox {

    public static void main(String[] args) {
        Browser browser = Playwright.create()
                .chromium()
                .launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(5000));

        Page page = browser.newPage();

        page.navigate("https://letcode.in/radio");



        PlaywrightAssertions.assertThat(page.locator("#notfoo")).isChecked();
        page.click("#foo");
        PlaywrightAssertions.assertThat(page.locator("#notfoo")).isChecked();
    }
}
