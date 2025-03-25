import com.microsoft.playwright.*;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class WebInputValue {
    public static void main(String[] args) {
        Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://letcode.in/edit");
        page.getByPlaceholder("Enter first & last name").fill("Puviyarasan Murugan");
        page.pause();
        Locator textBox = page.locator("#join");
        String existingText = textBox.getAttribute("value");
        textBox.fill(existingText +" person");
        textBox.press("Tab");

        page.locator("#clearMe").clear();
        page.locator("#noEdit").isEnabled();
        PlaywrightAssertions.assertThat(page.locator("#noEdit")).isDisabled();
        PlaywrightAssertions.assertThat(page.locator("#dontwrite")).isEditable();

        page.locator("").click();

    }
}
