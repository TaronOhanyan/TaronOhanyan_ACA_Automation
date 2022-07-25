package Base;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SeleniumBase {
    public static void main(String[] args) throws InterruptedException {
        amazonTest();
    }

    public static void amazonTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

        List<WebElement> table = driver.findElements(By.cssSelector("tr[style $= 'box-sizing: inherit;']"));
        System.out.println(table.size()+ "*******************");
        for (int i = 1; i <table.size() ; i++) {
            if (table.size() == 7){
                WebElement el = table.get(i).findElement(By.cssSelector("td:nth-child(1)"));
                System.out.println(el.getText() + "***********-------------");

            }
            System.out.println(table.get(i).getText());
        }





//        driver.close();


    }
}