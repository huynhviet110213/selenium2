import common.Utilities;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverManager extends DriverManager{

    @Override
    protected void createWebDriver() {
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        this.driver = new ChromeDriver(options);
    }
}
