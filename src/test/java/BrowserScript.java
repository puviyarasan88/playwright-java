import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BrowserScript {

	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
		BrowserType browserType= playwright.chromium();
		
		Browser browser = browserType.launch();
		
		Page page = browser.newPage();
		
		page.navigate("http://playwright.dev");
		System.out.println(page.title());
		

	}

}
