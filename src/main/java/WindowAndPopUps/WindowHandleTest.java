package WindowAndPopUps;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WindowHandleTest {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hollisterco.com/shop/eu");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'About Us')][@role='heading']"));

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();",element);
        element.click();


    }

    protected void timeout(){
        try {
            Thread.sleep(3000);
        }catch (InterruptedException interruptedException){
            System.out.println("InterruptedException thrown!!!");
            interruptedException.printStackTrace();
        }
    }

}
