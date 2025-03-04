import com.microsoft.playwright.Page;
import com.microsoft.playwright.junit.Options;
import com.microsoft.playwright.junit.OptionsFactory;
import com.microsoft.playwright.junit.UsePlaywright;
import org.junit.jupiter.api.Test;

@UsePlaywright(WebInputUsePlaywrightTest.CustomOptions.class)
public class WebInputUsePlaywrightTest {

    public static class CustomOptions implements OptionsFactory
    {
    @Override
    public Options getOptions() {
        return new Options()
                .setHeadless(false);
    }
    }

    @Test
    public void webInput(Page page){
        page.navigate("https://practice.expandtesting.com/inputs");
        page.locator("#input-number").fill("12345");
    }
}
