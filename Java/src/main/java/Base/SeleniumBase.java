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
        AutoAmTest();
    }

    public static void AutoAmTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.auto.am/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        driver.manage
//        txt.click();


        WebElement element = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='make']")));

        // Select Toyota
        WebElement selectElement = driver.findElement(By.id("filter-make"));
        Select selectObject = new Select(selectElement);
        selectObject.selectByValue("386");

        // Select Camry
        WebElement ToyotaCamry = driver.findElement(By.id("v-model"));
        Select Model = new Select(ToyotaCamry);
        Model.selectByValue("2517");

        // Select year 2019
        WebElement ToyotaYear = driver.findElement(By.cssSelector("[name=\"year[gt]\"]"));
        Select Year = new Select(ToyotaYear);
        Year.selectByValue("2019");

        // Select price 15,000
        WebElement ToyotaPrice = driver.findElement(By.cssSelector("[name=\"usdprice[gt]\"]"));
        Select Price = new Select(ToyotaPrice);
        Price.selectByValue("15000");



//        driver.close();


    }
}