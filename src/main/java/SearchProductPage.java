import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchProductPage extends BasePage {
    public SearchProductPage(WebDriver driver) {
        super(driver);
    }

    By productsLocator = By.className("product-detail");

    public SearchProductPage searchProducts(int product) {
        waitfor(productsLocator);
        finds(productsLocator,((product - 1))).click();
        log.info("Select to search product "+product);
        return this;
    }
}
