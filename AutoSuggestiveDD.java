package SeleniumWebTechniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AutoSuggestiveDD {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("Chi");

        List<WebElement> ddlist = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

        for (WebElement s: ddlist)
        {
            if (s.getText().equals("China")){
                s.click();
                break;
            }
        }

        Thread.sleep(2000);
        driver.quit();

    }
}
