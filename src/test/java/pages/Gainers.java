package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Gainers
{
    private WebDriver driver;

    public Gainers(WebDriver driver)
    {
        this.driver = driver;
    }

    public ExpectedCondition<WebElement> matchedResultsLoaded()
    {
        return ExpectedConditions.presenceOfElementLocated(By.cssSelector(
                "#fin-scr-res-table > div.W\\(100\\%\\) > div.D\\(ib\\).Fz\\(m\\).Fw\\(b\\).Lh\\(23px\\).W\\(75\\%\\)--mobp > span:nth-child(1) > span"));
    }
}
