package Locators.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WindowActivity {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://google.com"); // only this command will wait until all the components are presented in the UI.
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/"); // This command wont wait
        driver.navigate().back();
        Thread.sleep(1000);
        driver.manage().window().maximize();
        driver.manage().window().minimize();
        driver.navigate().forward();

        Thread.sleep(2000);
        driver.quit();
    }
}
