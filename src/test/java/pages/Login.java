package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Login
{
    private WebDriver driver;

    public Login(WebDriver driver)
    {
        this.driver = driver;
    }

    public ExpectedCondition<WebElement> usernameLoaded()
    {
        return ExpectedConditions.presenceOfElementLocated(By.id("login-username"));
    }

    public ExpectedCondition<WebElement> errorMessageLoaded()
    {
        return ExpectedConditions.visibilityOfElementLocated(By.id("username-error"));
    }
}
