package WindowHandles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserManageTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.10.0");
        Thread.sleep(3000);
        webDriver.manage().window().maximize();
        //Maximize - It maximizes the browser window
        System.out.println("Maximize - "+ webDriver.manage().window().getSize());
        Thread.sleep(3000);
        webDriver.manage().window().fullscreen();
        //Fullscreen - It makes the browser window to full scree where mode which covers the whole monitor screen
        System.out.println("Fullscreen - "+ webDriver.manage().window().getSize());
    }

}
