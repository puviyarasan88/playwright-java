import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BrowserTest {

	public static void main(String[] args) {

			try(Playwright playwright=Playwright.create())
			{
				try(Browser browser = playwright
						.chromium()
						.launch(new BrowserType.LaunchOptions().setHeadless(false)))
				{
					Page page = browser.newPage();

					page.navigate("https://playwright.dev/java/docs/writing-tests");


				}


			}








	}

}
