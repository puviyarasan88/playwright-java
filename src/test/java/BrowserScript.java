import java.util.regex.Pattern;


import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.assertions.PlaywrightAssertions;


public class BrowserScript {

	public static void main(String[] args) {

		try(Playwright playwright = Playwright.create())
		{
			BrowserType browserType= playwright.chromium();

			try(Browser browser = browserType.launch(new BrowserType.LaunchOptions().setHeadless(false)))

			{
				Page page = browser.newPage();

				page.navigate("http://playwright.dev");
				System.out.println(page.title());

				PlaywrightAssertions.assertThat(page).hasTitle(Pattern.compile("Playwright3"));

			}



		}
	}

}
