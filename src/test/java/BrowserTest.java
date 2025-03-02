import com.microsoft.playwright.*;

import java.nio.file.Path;
import java.nio.file.Paths;

public class BrowserTest {

	public static void main(String[] args) {

			try(Playwright playwright=Playwright.create())
			{
				try(Browser browser = playwright
						.chromium()
						.launch(new BrowserType.LaunchOptions().setHeadless(true).setSlowMo(50)))
				{
					Page page = browser.newPage();
					page.navigate("https://playwright.dev/java/docs/writing-tests");
					page.screenshot(new Page.ScreenshotOptions()
							.setPath(Paths.get(System.getProperty("user.dir")+"//screenshot//test.png")));
				}


			}








	}

}
