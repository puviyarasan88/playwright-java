import com.microsoft.playwright.*;
import com.microsoft.playwright.assertions.PlaywrightAssertions;

public class InputField {
    public static void main(String[] args) {

        Browser browser = Playwright.create()
                .chromium()
                .launch(new BrowserType.LaunchOptions().setHeadless(false));

        Page page = browser.newPage();
        page.navigate("https://letcode.in/edit");

        //Type name
        page.fill("#fullName", "Puvi");

        //Get attribute
        String name = page.locator("#join").getAttribute("value");
        System.out.println(name);

        String name1 = page.getAttribute("#join", "value");
        System.out.println(name1);

        page.locator("#clearMe").clear();
//        PlaywrightAssertions.assertThat(page.locator("#noEdit")).isEditable();

        Locator write = page.locator("#dontwrite");
        PlaywrightAssertions.assertThat(write).isEnabled();
        PlaywrightAssertions.assertThat(write).isEditable();


    }
}
