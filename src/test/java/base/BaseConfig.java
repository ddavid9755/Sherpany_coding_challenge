package base;

import helper.BrowserCapabilities;
import helper.ConfigFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import pages.LoginPage;

public class BaseConfig {
    protected WebDriver driver;
    protected ConfigFileReader configFileReader;
    protected LoginPage loginPage;

    @BeforeMethod
    @Parameters("browserType")
    public void setUp(String browserType) {
        configFileReader = new ConfigFileReader();

        if (browserType.equalsIgnoreCase("Chrome"))
        {
            driver = new ChromeDriver(BrowserCapabilities.getChromeOptions());
        }
        else if (browserType.equalsIgnoreCase("Firefox"))
        {
            driver = new FirefoxDriver(BrowserCapabilities.getFirefoxOptions());
            driver.manage().window().setSize(new org.openqa.selenium.Dimension(1920, 1080));
        }
        else if (browserType.equalsIgnoreCase("Edge"))
        {
            driver = new EdgeDriver(BrowserCapabilities.getEdgeOptions());
            driver.manage().window().setSize(new org.openqa.selenium.Dimension(1920, 1080));
        }
        driver.get(configFileReader.getApplicationUrl());
        loginPage = new LoginPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
