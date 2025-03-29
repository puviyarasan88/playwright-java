import com.microsoft.playwright.*;

import java.util.List;

public class WindowHandling {

    public static void main(String[] args) {

        Browser browser = Playwright.create()
                .chromium()
                .launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(5000));

        BrowserContext bc= browser.newContext();
        Page parentpage = bc.newPage();

        parentpage.navigate("https://letcode.in/window");

        Page newPage = bc.waitForPage(()-> {
            parentpage.click("#home");
        });


        System.out.println(newPage.title());


    }
}
