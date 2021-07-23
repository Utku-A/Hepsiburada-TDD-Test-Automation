import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

class HepsiburadaTest extends BaseTest {
    
    IndexPage indexPage;
    SearchProductPage searchProductPage;
    ProductPage productPage;
    ProductCardPage productCardPage;
    ShoppingLoginPage shoppingLoginPage;

    @Test
    @Order(1)
    public void TS001() {
        indexPage = new IndexPage(driver);
        searchProductPage = new SearchProductPage(driver);
        productPage = new ProductPage(driver);
        productCardPage = new ProductCardPage(driver);
        shoppingLoginPage = new ShoppingLoginPage(driver);

        indexPage
                .searchProductArea("Araba")
                .searchClickButton();
        searchProductPage
                .searchProducts(2);
        productPage
                .increase(3)
                .addToCard()
                .shoppingCard();
        productCardPage
                .completeShopButton();

    }

    @Test
    @Order(2)
    public void TS002() {
        shoppingLoginPage = new ShoppingLoginPage(driver);

        shoppingLoginPage
                .loginEmail("deneme@denememail.com")
                .passwordTextArea("deneme123")
                .loginButtonClick()
                .continueWithoutLogin()
                .continueEmail("deneme@denememail.com")
                .continueButtonClick();
    }

}

