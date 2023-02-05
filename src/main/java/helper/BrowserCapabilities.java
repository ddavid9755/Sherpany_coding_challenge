package helper;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserCapabilities {

    public static ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        options.addArguments("--window-size=1920,1080");
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--enable-javascript");
        options.addArguments("--disable-notifications");
        options.addArguments("--incognito");
        return options;
    }

    public static FirefoxOptions getFirefoxOptions(){
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        options.addArguments("--window-size=1920,1080");
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--enable-javascript");
        options.addArguments("--disable-notifications");
        return options;
    }

    public static EdgeOptions getEdgeOptions(){
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        options.addArguments("--window-size=1920,1080");
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--enable-javascript");
        options.addArguments("--disable-notifications");
        return options;
    }
}
