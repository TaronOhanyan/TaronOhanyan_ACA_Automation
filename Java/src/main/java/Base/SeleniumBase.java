package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SeleniumBase {
    public static void main(String[] args) throws InterruptedException {
        amazonTest();
    }

    public static void amazonTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.auto.am/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='make']")));

        WebElement selectElement = driver.findElement(By.id("filter-make"));
        Select selectObject = new Select(selectElement);
        selectObject.selectByValue("386");


        WebElement ToyotaCamry = driver.findElement(By.id("v-model"));
        Select Model = new Select(ToyotaCamry);
        Model.selectByValue("2517");








//        driver.close();


    }
}