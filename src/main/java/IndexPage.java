import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IndexPage extends BasePage {
    public IndexPage(WebDriver driver) {
        super(driver);
    }


    By searchAreaLocator = By.className("desktopOldAutosuggestTheme-input");
    By searchButtonLocator = By.className("SearchBoxOld-buttonContainer");

    public IndexPage searchProductArea (String productName) {
        set(searchAreaLocator,productName);
        Object a = find(searchAreaLocator).getAttribute("value");
        Assertions.assertEquals(productName, a, "Search product not correct");
        log.info(productName+" Search products ");
        return this;
    }

    public void searchClickButton () {
        click(searchButtonLocator);
        log.info("Search button clicked");
    }
}
