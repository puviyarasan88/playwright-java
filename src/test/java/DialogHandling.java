import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class DialogHandling {

    public static void main(String[] args) {

        Browser browser = Playwright
                            .create()
                            .chromium()
                            .launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(5000));

        Page page = browser.newPage();

        page.navigate("https://demoqa.com/alerts");


       page.onDialog(dialog -> {
           System.out.println(dialog.type());
           System.out.println(dialog.message());
           dialog.accept("Puvi");
       });
       page.click("#promtButton");

    }
}
