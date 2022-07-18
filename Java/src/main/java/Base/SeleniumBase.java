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


        //find Disable / Enable buttons
        WebElement DisEn = driver.findElement(By.id("enabled-example-input"));

        // input Disable / Enable fields
        DisEn.sendKeys("Disable / Enable");


        // find Support button
        WebElement Support = driver.findElement(By.cssSelector("[href=\"/support\"]"));

        // click on Support button
        Support.click();



        // find Name
        WebElement Name = driver.findElement(By.cssSelector("[name=\"name\"]"));

        // input Name field
        Name.sendKeys("Taron");


        // find Email
        WebElement Email = driver.findElement(By.cssSelector("[type=\"email\"]"));

        // input Email field
        Email.sendKeys("Taron@gmail.com");


        // find Comment
        WebElement Comment = driver.findElement(By.cssSelector("[class=\"form-control\"]"));

        // input Comment field
        Comment.sendKeys("Hello World");


        // find Submit button
        WebElement Submit = driver.findElement(By.cssSelector("[type=\"submit\"]"));

        // click on Submit button
        Submit.click();


        // find Submit button
        WebElement ThankYou = driver.findElement(By.cssSelector("[style=\"text-align:center;color:#3c763d;\"]"));

        // click on Submit button



//        driver.close();


    }
}
