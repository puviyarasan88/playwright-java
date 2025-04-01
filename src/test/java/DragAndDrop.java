import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.FrameLocator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class DragAndDrop {

    public static void main(String[] args)
    {
        Page page;
        try (Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false))) {

            page = browser.newPage();
        }
        page.navigate("https://jqueryui.com/droppable/");

        FrameLocator frameLocator = page.frameLocator(".demo-frame");

        frameLocator.locator("#draggable").dragTo(frameLocator.locator("#droppable"));
    }
}
