import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(TestWatcher.class)

public class BaseTest {

    Log log = new Log();
    WebDriver driver;

    @BeforeAll
    public void startUp() {
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        log.info("Test Start");
        log.info("========================================================");
        driver.get("https://www.hepsiburada.com/");
    }


    @AfterAll
    public void tearDown() {
        log.info("========================================================");
        log.info("Test finished");
        driver.close();
    }

}
