import com.microsoft.playwright.*;
import com.microsoft.playwright.assertions.PlaywrightAssertions;


public class ButtonAction {
    public static void main(String[] args) {
        Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://letcode.in/button");
        page.click("#home");
        page.goBack();
//        page.pause();
        String color = page.locator("//button[@id='property']").evaluate("ele => getComputedStyle(ele).color").toString();
        System.out.println(color);

        Locator button= page.locator("//h2[contains(text(),'Button Hold')]");
        button.hover();
        page.mouse().down();
        page.waitForTimeout(2000);
        page.mouse().up();
//        page.click("#Test");

        PlaywrightAssertions.assertThat(page.locator("//h2[contains(text(),'Button has been long pressed')]")).isVisible();
    }
}
