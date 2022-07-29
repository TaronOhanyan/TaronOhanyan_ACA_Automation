package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeneralBase {
    public static void main(String[] args) throws InterruptedException {
        amazonTest();
    }

    public static void amazonTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
//        driver.navigate().to("https://www.amazon.com/");
//        driver.navigate().back();
//        TimeUnit.SECONDS.sleep(1);
//        String title = driver.getTitle();
//        System.out.println(title);
//
//        //find the search field
//        WebElement searchField = driver.findElement(By.id("twotabsearchtextbox"));
//
//        // input value into field
//        searchField.sendKeys("macbook");
//
//        // find search button
//        WebElement searchButton = driver.findElement(By.cssSelector("[id='nav-search-submit-text']"));
//
//        // click on search button
//        searchButton.click();
//
//
//        driver.close();


    }
}