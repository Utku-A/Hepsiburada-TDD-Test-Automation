import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    By addToCardLocator = By.id("addToCart");
    By increaseLocator = By.xpath("//*[@id=\"addToCartForm\"]/div/div/button[2]");
    By shoppingCardLocator = By.id("shoppingCart");

    public ProductPage addToCard() {
        find(addToCardLocator).click();
        return this;
    }

    public ProductPage increase(int more) {
        for (int i=1;i < more;i++) {
            waitfor(increaseLocator);
            find(increaseLocator).click();
        }
        log.info(more+" Add products to shipping card");
        return this;
    }

    public ProductPage shoppingCard() {
        find(shoppingCardLocator).click();
        log.info("Shipping card clicked");
        return this;
    }

}
