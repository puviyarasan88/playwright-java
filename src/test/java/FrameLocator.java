import com.microsoft.playwright.*;

import java.util.List;

public class FrameLocator {

    public static void main(String[] args) {

        Browser browser = Playwright.create().chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();

        page.navigate("https://letcode.in/frame");

//        List<Frame> frame = page.frames();
//        for(Frame fra: frame)
//        {
//            System.out.println(fra.title());
//        }
        Frame frameEle = page.frame("hjii");
        frameEle.locator("input[name='fname']").fill("Pubi");

        page.frameLocator("iframe[name='firstFr']")
                .frameLocator("iframe[src='innerframe']")
                .locator("[placeholder='Enter email']")
                .fill("pubi78@gmail.com");



    }
}
