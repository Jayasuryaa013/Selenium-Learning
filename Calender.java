package SeleniumWebTechniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Calender {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
        Thread.sleep(1000);
        // if the class name have classname and it have space between then we have to use dot . or it wont work
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();

        Thread.sleep(1000);
        driver.quit();
    }
}
