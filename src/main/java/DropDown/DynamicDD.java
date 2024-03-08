package DropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDD {

    public static void main(String[] args) {
        TestFlow testFlow = new TestFlow();
        testFlow.testRun();
        }

}

class TestFlow{

    protected void testRun(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[contains(text(),'From')]/following-sibling::div/input")).click();
        timeout();
        driver.findElement(By.xpath("//div[div[contains(text(),'From')]]/following-sibling::div//div[contains(text(),'Bengaluru')]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'To')]/following-sibling::div/input")).click();
        timeout();
        driver.findElement(By.xpath("//div[div[contains(text(),'To')]]/following-sibling::div//div[contains(text(),'Delhi')]")).click();
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
