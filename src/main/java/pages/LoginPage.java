package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    private By emailInput = By.id("email");
    private By emailLabel = By.cssSelector("label[for='email']");
    private By passwordInput = By.id("password");
    private By passwordLabel = By.cssSelector("label[for='password']");
    private By separatorLabel = By.cssSelector("span[class*='AlternativeAction_label']");
    private By loginButton = By.cssSelector("button[type=submit]");
    private By secondaryLoginButton = By.cssSelector("button[class*='Button_secondary']");
    private By forgotPasswordButton = By.cssSelector("button[class*='forgotPasswordAction']");
    private By languageDropdown = By.cssSelector("[class*='Select_select']");
    private By getHelpButton = By.cssSelector("button[class*='GetHelpAction']");
    private By requestDemoLink = By.cssSelector("a[class*=RequestDemoAction_link]");
    private By requestDemoLabel = By.cssSelector("[class*='RequestDemoAction'] span");
    private By forgotPasswordInputLabel = By.cssSelector("p[class*='ContentBoxBody']");
    private By sherpanyHomeLink = By.cssSelector("a[href='https://www.sherpany.com/']");
    private By meetingResourcesLink = By.cssSelector("a[href='https://www.sherpany.com/resources/meeting-management/']");
    private By privacyPolicyLink = By.cssSelector("a[href='https://www.sherpany.com/privacy-policy/']");
    private By termsOfUseLink = By.cssSelector("a[href='https://app.sherpany.com/terms/']");
    private By downloadIosLink = By.cssSelector("a[href='https://itunes.apple.com/app/id1172873177']");
    private By downloadAppStoreLink = By.cssSelector("a[href='https://play.google.com/store/apps/details?id=ch.sherpany.boardroom']");
    private By downloadWindowsLink = By.cssSelector("a[href='https://www.microsoft.com/store/apps/9NH1PR95ZXF7']");
    private By errorMessage = By.cssSelector("[class*=ErrorMessage_message]");
    private By downloadOn = By.cssSelector("[class*=NativeAppsLinks_label]");
    private By returnToLogin = By.cssSelector("[class*=ForgotPasswordForm_returnToLoginAction]");
    private By dropdownOptions = By.cssSelector("[class*='Select_option']");
    private By getLinkByGeneralTag = By.tagName("a");
    private By getImgByGeneralTag = By.tagName("img");
    private By title = By.cssSelector("title");
    public void waitForPageToLoad() {
        FluentWait wait = new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(15));
        wait.pollingEvery(Duration.ofSeconds(1));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));
    }

    public void waitForElementToLoad(By element) {
        FluentWait wait = new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(15));
        wait.pollingEvery(Duration.ofSeconds(1));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.elementToBeClickable(element));
        driver.findElement(element).isDisplayed();
    }

    public void selectLanguageFromDropdown(String language) {
        waitForElementToLoad(languageDropdown);
        waitForPageToLoad();
        driver.findElement(languageDropdown).click();
        List<WebElement> allOptions = driver.findElements(dropdownOptions);
        for(int i = 0; i<=allOptions.size()-1; i++) {
            if(allOptions.get(i).getText().contains(language)) {
                allOptions.get(i).click();
                break;
            }
        }
        waitForElementToLoad(languageDropdown);
        waitForPageToLoad();
    }

    public void checkElementState(By element) {
        waitForElementToLoad(element);
        driver.findElement(element).isEnabled();
        driver.findElement(element).isDisplayed();
    }

    public String checkElementLabel(By labelElement) {
        waitForElementToLoad(labelElement);
        return driver.findElement(labelElement).getText();
    }

    public void setInputText(By elementName, String inputText){
        driver.findElement(elementName).sendKeys(inputText);
    }

    public void clickElement(By elementName) {
        waitForPageToLoad();
        waitForElementToLoad(elementName);
        driver.findElement(elementName).click();

    }

    public void waitForTitle(){
         if(driver.findElements(title).size()<3){
             waitForPageToLoad();
             waitForElementToLoad(emailInput);
         }
    }
    public int checkLinks() {
        int count = 0;
        List<WebElement> links = driver.findElements(getLinkByGeneralTag);
        System.out.println("Links count: " + links.size());
        for (int i = 0; i < links.size(); i++) {
            WebElement element = links.get(i);
            String url = element.getAttribute("href");
            try {
                URL link = new URL(url);
                HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
                httpConn.connect();
                int code = httpConn.getResponseCode();
                if (code >= 400) {
                    System.out.println("Broken Link: " + url);
                    count++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Broken links count: " + count);
        return count;
    }

    public int checkImages() {
        int count = 0;
        List<WebElement> images = driver.findElements(getImgByGeneralTag);
        System.out.println("Images count: " + images.size());
        for (int i = 0; i < images.size(); i++) {
            WebElement element = images.get(i);
            String url = element.getAttribute("src");
            try {
                URL link = new URL(url);
                HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
                httpConn.connect();
                int code = httpConn.getResponseCode();
                if (code >= 400) {
                    System.out.println("Broken Image: " + url);
                    count++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("Broken images count: " + count);
        return count;
    }

    public By getEmailInput() {
        return emailInput;
    }
    public By getPasswordInput() {
        return passwordInput;
    }
    public By getLoginButton() {
        return loginButton;
    }
    public By getSecondaryLoginButton() {
        return secondaryLoginButton;
    }
    public By getForgotPasswordButton() {
        return forgotPasswordButton;
    }
    public By getLanguageDropdown() {
        return languageDropdown;
    }
    public By getGetHelpButton() {
        return getHelpButton;
    }
    public By getRequestDemoLink() {
        return requestDemoLink;
    }
    public By getSherpanyHomeLink() {
        return sherpanyHomeLink;
    }
    public By getMeetingResourcesLink() {
        return meetingResourcesLink;
    }
    public By getPrivacyPolicyLink() {
        return privacyPolicyLink;
    }
    public By getTermsOfUseLink() {
        return termsOfUseLink;
    }
    public By getDownloadIosLink() {
        return downloadIosLink;
    }
    public By getDownloadAppStoreLink() {
        return downloadAppStoreLink;
    }
    public By getDownloadWindowsLink() {
        return downloadWindowsLink;
    }
    public By getErrorMessage() {
        return errorMessage;
    }
    public By getEmailLabel() {
        return emailLabel;
    }
    public By getPasswordLabel() {
        return passwordLabel;
    }
    public By getSeparatorLabel() {
        return separatorLabel;
    }
    public By getRequestDemoLabel() {
        return requestDemoLabel;
    }
    public By getForgotPasswordInputLabel() {
        return forgotPasswordInputLabel;
    }
    public By getDownloadOn() {
        return downloadOn;
    }
    public By getReturnToLogin() {
        return returnToLogin;
    }
}
