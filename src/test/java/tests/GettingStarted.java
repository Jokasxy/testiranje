package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.Help;
import pages.Homepage;

public class GettingStarted
{
    private WebDriver driver;
    //Declare a test URL variable
    private String testURL = "https://finance.yahoo.com/";

    @BeforeMethod
    @Parameters("browser")
    public void setupTest(String browser)
    {
        if(browser.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "C:\\projects\\testiranje\\chromedriver.exe");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        else if(browser.equalsIgnoreCase("edge"))
        {
            System.setProperty("webdriver.edge.driver", "C:\\projects\\testiranje\\MicrosoftWebDriver.exe");
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }

        driver.manage().deleteAllCookies();
        driver.navigate().to(testURL);
    }

    @Test
    @Parameters("browser")
    public void gettingStartedTest(String browser) throws InterruptedException
    {
        driver.manage().window().maximize();
        Homepage homepage = new Homepage(driver);
        new WebDriverWait(driver,30).until(homepage.agreeButtonClickable()).click();
        if(browser.equalsIgnoreCase("edge"))
        {
            Thread.sleep(2000);
        }
        new WebDriverWait(driver,30).until(homepage.helpClickable()).click();
        Help help = new Help(driver);
        new WebDriverWait(driver,30).until(help.gettingStartedClickable()).click();
        WebElement header = new WebDriverWait(driver,30).until(help.headerLocated());
        Assert.assertEquals(header.getText().toLowerCase(), ("Getting started with Yahoo Finance").toLowerCase());
        System.out.print(header.getText());
    }

    @AfterMethod
    public void teardownTest()
    {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
