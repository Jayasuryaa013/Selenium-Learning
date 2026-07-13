package SeleniumWebTechniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Surya");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input#alertbtn")).click();
        //If we have any alert we need to user switch to alert method to navigate to alert window
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        // The above method is for only one opiton alert which is OK. suppose we have two options in alert like ok and cancel then use below
        driver.findElement(By.id("confirmbtn")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

        Thread.sleep(2000);
        driver.quit();
    }
}
