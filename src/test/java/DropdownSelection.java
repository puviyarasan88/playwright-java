import com.microsoft.playwright.*;
import com.microsoft.playwright.options.SelectOption;

public class DropdownSelection {
    public static void main(String[] args) {
        Browser browser = Playwright.create()
                                     .chromium()
                                      .launch(new BrowserType.LaunchOptions().setHeadless(false));

        Page page = browser.newPage();
        page.navigate("https://letcode.in/dropdowns");
        page.locator("#fruits").selectOption("Apple");
        page.locator("#superheros").selectOption(new String[]{"Aquaman", "Batman"});
        page.locator("#superheros").selectOption(new SelectOption().setIndex(5));






    }
}
