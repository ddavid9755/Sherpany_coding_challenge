# Sherpany_coding_challenge

## Table of contents
1. Technologies
2. Clean code
3. Framework design
4. Installation
5. Running tests
6. Locator strategy

## 1. Technologies
- Programming language: **Java 11**
- Test automation tools: **Selenium** **Webdriver** **4.7.1**, **TestNG** **7.7.0**
- Compiler: **Maven** **3.10.1**

## 2. Clean code
Standard **Java coding convention** was used during the implementation, and it should be used in case of future implementations.

## 3. Framework design
The framework is using **POM (Page object model)** design. Because of that, the elements and actions are separated from the actual tests. 

There are 2 main folders inside src folder: **main** and **test**. 

- **main folder**: contains the elements and actions with elements on different pages. The classes represents pages, or larger elements of a page.
- **resources**: contains every test related file.
- **test folder**: contains pure tests which are using the pages from main folder, ending with assertions. Logging should be added in later phase of development.

New Pages and Helper methods should be added under **src/main folder**.

Test cases should be added under **src/test** folder.

Force **Encapsulation** where possible, only use public methods/variables/etc if necessary.

Try to **avoid hard coding** by using the **configurations.properties** file. When doing so, don't forget to update the **ConfigFileReader class** with the recently added variable reader methods.

To prevent repetitiveness, always add new page names as Enums to the **src/main/java/pages/Helper class**.

## 4. Installation 
The repository should be cloned from Github to your local machine. The tests can be executed with TestNG file. Chrome, Firefox, and Edge browsers should have the latest version installed on the executer machine. The framework is using RemoteWebdriver, thus no additional action is needed.

## 5. Running tests
Select and run the **"testng.xml"** file to execute the tests on Chrome, Firefox and Edge browser.

## 6. Locator strategy
The order of the preferred locators is the following:
1. **Id.**
2. **Name.**
3. **Class name.**
4. **Link text or partial link text.**
5. **CSS selector.**
6. **Xpath selector.**







