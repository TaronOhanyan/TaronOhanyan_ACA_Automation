package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumBase {
    public static void main(String[] args) throws InterruptedException {
        amazonTest();
    }

    public static void amazonTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://courses.letskodeit.com/practice");


        //find BMW RadioButton
        WebElement BMWRadioButton = driver.findElement(By.id("bmwradio"));

        // click on BMW RadioButton
        BMWRadioButton.click();


        //find BMW HONDA CheckBox
        WebElement HONDACheckBox = driver.findElement(By.id("hondacheck"));

        // click on HONDA CheckBox
        HONDACheckBox.click();


        //find Diasble / Enable buttons
        WebElement DisEn = driver.findElement(By.id("enabled-example-input"));



//        driver.close();


    }
}
