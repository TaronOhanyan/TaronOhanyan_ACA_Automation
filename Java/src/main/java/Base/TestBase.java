package Base;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
    @Test
    public void Test1() {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/");

        WebElement SignUp = driver.findElement(By.id("signin2"));
        SignUp.click();


        WebElement UserName = driver.findElement(By.id("sign-username"));
        UserName.click();

        UserName.sendKeys("Taron");



//        // find Name
//        WebElement Name = driver.findElement(By.cssSelector("[name=\"name\"]"));
//
//        // input Name field
//        Name.sendKeys("Taron");

    }

}
