package Base;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class TestBase {
    @Test
    public void Test1() {
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.demoblaze.com/index.html");

        WebElement SignUp = driver.findElement(By.id("signin2"));
        SignUp.click();

        // find Name
        WebElement Name = driver.findElement(By.id("sign-username"));

        // input Name field
        Name.sendKeys("Taron");













//        String window1 = driver.getWindowHandle();
//
//
//
//        String window2 = null;
//
//        for (String window : currentWindows) {
//            if (!window.equals(window1)) {
//                window2 = window;
//            break;
//            }
//        }
//
//        driver.switchTo().window(window2);
//        driver.get("https://www.demoblaze.com/index.html");



//        WebElement UserName = driver.findElement(By.cssSelector("[class=\"form-control\"]"));
//
//        UserName.sendKeys("Taron");

//        // find Name
//        WebElement Name = driver.findElement(By.cssSelector("[name=\"name\"]"));
//
//        // input Name field
//        Name.sendKeys("Taron");

    }

}
