import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductCardPage extends BasePage{
    public ProductCardPage(WebDriver driver) {
        super(driver);
    }

    By completeShopButtonLocator = By.id("continue_step_btn");

    public ProductCardPage completeShopButton() {
        waitfor(completeShopButtonLocator);
        find(completeShopButtonLocator).click();
        log.info("Complete shop button clicked");
        return this;
    }

}
