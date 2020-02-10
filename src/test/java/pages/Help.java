package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Help
{
    private WebDriver driver;

    public Help(WebDriver driver)
    {
        this.driver = driver;
    }

    public ExpectedCondition<WebElement> gettingStartedClickable()
    {
        return ExpectedConditions.elementToBeClickable(By.cssSelector("#faqdiv > a"));
    }

    public ExpectedCondition<WebElement> headerLocated()
    {
        return ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#article_container > article > h1"));
    }
}
