import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends BaseTest {
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement find(By locator) {
        return driver.findElement(locator);
    }

    public WebElement finds(By locator,int number) {
        return driver.findElements(locator).get(number);
    }

    public void click(By locator) {
        find(locator).click();
    }

    public void set(By locator,String text) {
        find(locator).sendKeys(text);
    }

    public void waitfor(By locator) {
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }
}
