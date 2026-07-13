package SeleniumWebTechniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class CheckBox {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        System.out.println(driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).isSelected());
        driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).click();
        System.out.println(driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).isSelected());

        //How to find how many checkbox we have in page - To know that first we need to find the common attribute and value for all the checkbox

        System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
    }
}
