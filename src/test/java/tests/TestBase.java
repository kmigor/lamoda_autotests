package tests;

import com.codeborne.selenide.Configuration;
import helpers.Attach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;
import java.util.Objects;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class TestBase {
    @BeforeAll
    static void beforeAll() {
        if ("true".equals(System.getProperty("remote"))) {
            Configuration.remote = "https://" + System.getProperty("remoteUser") + "@" + System.getProperty("remoteUrl");
            Configuration.browser = System.getProperty("browserName");
            Configuration.browserVersion = System.getProperty("browserVersion");
            Configuration.browserSize = System.getProperty("browserSize");

        } else {
            Configuration.browser = "chrome";
            Configuration.browserSize = "1920x1080";
        }
        Configuration.baseUrl = "https://www.lamoda.ru";
        Configuration.pageLoadStrategy = "eager";
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("selenoid:options", Map.<String, Object>of("enableVNC", true, "enableVideo", true));
        Configuration.browserCapabilities = capabilities;
    }

    @AfterEach
    void addAttachments() {
        Attach.screenshotAs("LastScreenshot");
        if (!Objects.equals(Configuration.browser, "firefox")) {
            Attach.pageSource();
            Attach.browserConsoleLogs();
        }
        Attach.addVideo();
        closeWebDriver();
    }
}