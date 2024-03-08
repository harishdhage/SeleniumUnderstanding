package PopupAndAlert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class JavascriptPoupUpAlertTest {
    public static void main(String[] args) {
        PopupAndAlertDemo popupAndAlertDemo = new PopupAndAlertDemo();
        popupAndAlertDemo.testFlow();
    }
}

class PopupAndAlertDemo{
    WebDriver driver;

    public PopupAndAlertDemo(){
        driver = new ChromeDriver();
    }

    public void testFlow(){
        driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
//        driver.manage().window().maximize();
//        timeout();
        WebElement webElement = driver.findElement(By.xpath("//input[@type='button']"));
//        Actions action = new Actions(driver);
//        action.scrollToElement(webElement);
//        timeout();
        webElement.click();
//        timeout();
        System.out.println("Alert message : "+driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

    }

    protected void timeout(){
        try {
            Thread.sleep(3000);
        }catch (InterruptedException interruptedException){
            System.out.println("InterruptedException thrown!!!");
            interruptedException.printStackTrace();
        }finally {
            driver.close();
        }
    }
}
