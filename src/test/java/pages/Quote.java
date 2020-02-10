package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Quote
{
    private WebDriver driver;

    public Quote(WebDriver driver)
    {
        this.driver = driver;
    }

    public ExpectedCondition<WebElement> headerLocated()
    {
        return ExpectedConditions.visibilityOfElementLocated(By.tagName("h1"));
    }
}
