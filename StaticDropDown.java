package SeleniumWebTechniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class StaticDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //If any dropdown have a tag as Select = Static Dropdown then use the below method to handle
        WebElement Dropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown = new Select(Dropdown);

        dropdown.selectByValue("USD");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByIndex(2);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByVisibleText("INR");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        Thread.sleep(2000);
        driver.quit();
    }
}
