import com.microsoft.playwright.*;

import java.nio.file.Paths;

public class ButtonAction {
    public static void main(String[] args) {
        Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://letcode.in/button");
        page.click("#home");
        page.goBack();

        page.pdf(new Page.PdfOptions().setPath(Paths.get("output.pdf")));
    }
}
