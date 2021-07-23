import org.junit.jupiter.api.extension.ExtensionContext;
import java.util.Optional;

public class TestWatcher implements org.junit.jupiter.api.extension.TestWatcher {
    Log log = new Log();

    @Override
    public void testDisabled(ExtensionContext context, Optional<String> reason) {

    }

    @Override
    public void testSuccessful(ExtensionContext context) {
        String testName = context.getDisplayName();
        log.info(testName + " Passed ");
        log.info("");
    }

    @Override
    public void testAborted(ExtensionContext context, Throwable cause) {

    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        String testName = context.getDisplayName();
        String failCause = cause.getMessage();
        log.info("");
        log.info(testName + " Fail " + failCause);
    }
}
