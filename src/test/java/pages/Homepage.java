package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Homepage
{
    private WebDriver driver;

    public Homepage(WebDriver driver)
    {
        this.driver = driver;
    }

    public ExpectedCondition<WebElement> SP500Clickable()
    {
        return ExpectedConditions.elementToBeClickable(By.cssSelector("#market-summary > div > div.D\\(ib\\).Fl\\(start\\) > div.Carousel-Mask.Pos\\(r\\).Ov\\(h\\).market-summary.M\\(0\\).Pos\\(r\\).Ov\\(h\\).D\\(ib\\).Va\\(t\\) > ul > li:nth-child(1) > h3 > a.Fz\\(s\\).Ell.Fw\\(600\\).C\\(\\$c-fuji-blue-1-b\\)"));
    }

    public ExpectedCondition<WebElement> agreeButtonClickable()
    {
        return ExpectedConditions.elementToBeClickable(By.name("agree"));
    }

    public ExpectedCondition<WebElement> searchLoaded()
    {
        return ExpectedConditions.elementToBeClickable(By.name("yfin-usr-qry"));
    }

    public ExpectedCondition<WebElement> signInClickable()
    {
        return ExpectedConditions.elementToBeClickable(By.id("uh-signedin"));
    }

    public ExpectedCondition<WebElement> customizeClickable()
    {
        return ExpectedConditions.elementToBeClickable(By.cssSelector(
                "#Col2-2-DataUtility-Proxy > section > header > div.M\\(0\\).O\\(n\\)\\:f.IbBox.Bdrs\\(3px\\).C\\(\\$c-fuji-grey-j\\).Fz\\(s\\).Fl\\(end\\) > div"));
    }

    public ExpectedCondition<WebElement> stockGainersClickable()
    {
        return ExpectedConditions.elementToBeClickable(By.cssSelector(
                "#dropdown-menu > div.C\\(black\\) > ul > li:nth-child(5) > a"));
    }

    public ExpectedCondition<WebElement> helpClickable()
    {
        return ExpectedConditions.elementToBeClickable(By.cssSelector(
                "#Col2-7-Footer > div.Fz\\(s\\).D\\(ib\\).Pt\\(5px\\) > div:nth-child(1) > a:nth-child(2)"));
    }
}
