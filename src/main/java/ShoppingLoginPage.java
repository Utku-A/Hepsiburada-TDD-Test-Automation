import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingLoginPage extends BasePage{
    public ShoppingLoginPage(WebDriver driver) {
        super(driver);
    }

    By emailTextAreaLocator = By.id("txtUserName");
    By continueEmailTextAreaLocator = By.id("txtEmail");
    By passwordTextAreaLocator = By.id("txtPassword");
    By loginButtonLocator = By.id("btnLogin");
    By continueWithoutLoginLocator = By.className("_16qmsXw10rJ7J6Kq05pWFW");
    By continueButtonClickLocator = By.id("btnWithoutMemberShip");
    //By shoppingComplate = By

    public ShoppingLoginPage loginEmail(String email) {
        waitfor(emailTextAreaLocator);
        set(emailTextAreaLocator,email);
        Object a = find(emailTextAreaLocator).getAttribute("value");
        Assertions.assertEquals(email, a, "Email not correct");
        log.info("Set input email");
        return this;
    }

    public ShoppingLoginPage continueEmail(String email) {
        waitfor(continueEmailTextAreaLocator);
        set(continueEmailTextAreaLocator,email);
        Object a = find(continueEmailTextAreaLocator).getAttribute("value");
        Assertions.assertEquals(email, a, "Email not correct");
        log.info("Set input email");
        return this;
    }

    public ShoppingLoginPage passwordTextArea(String password) {
        waitfor(passwordTextAreaLocator);
        set(passwordTextAreaLocator,password);
        Object a = find(passwordTextAreaLocator).getAttribute("value");
        Assertions.assertEquals(password, a, "Search product not correct");
        log.info("Set input password");
        return this;
    }

    public ShoppingLoginPage loginButtonClick() {
        waitfor(loginButtonLocator);
        click(loginButtonLocator);
        log.info("Login button clicked");
        return this;
    }

    public void continueButtonClick() {
        waitfor(continueButtonClickLocator);
        click(continueButtonClickLocator);
        log.info("Login button clicked");
    }

    public ShoppingLoginPage continueWithoutLogin() {
        waitfor(continueWithoutLoginLocator);
        find(continueWithoutLoginLocator).click();
        log.info("Continue without login clicked");
        return this;
    }
}
