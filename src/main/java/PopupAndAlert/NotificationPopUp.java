package PopupAndAlert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class NotificationPopUp {
    public static void main(String[] args) {
        TestNotification testNotification = new TestNotification();
        testNotification.testFlow();
    }
}

class TestNotification{
    WebDriver driver;

    public void setDriver() {
        Map<String, Object> preference = new HashMap<>();
        preference.put("profile.default_content_setting_values.notifications", 2);
        ChromeOptions opt = new ChromeOptions();
        opt.setExperimentalOption("pref", preference);
//        opt.addArguments("--disable-notifications");

        this.driver = new ChromeDriver(opt);
    }

    public void testFlow(){
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }
}