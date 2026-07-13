package SeleniumWebTechniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class UIElements {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();

        //System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
        //driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        //System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
        //Incase if the element is disabled and when user click on the element then it should turn it to enable. for that above
        // code should not work. So the user needs to find the attribute in HTML which is changing during enable and disable.

        //System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

        //System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

        //In this above case one of the attribute is changing during clicking on radio button for this disabled element. So we are
        //grabbing that particular attribute using above .getAttribute method and printing to see the changing value.
        if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")){
            Assert.assertTrue(true);
        }
        else {
            Assert.assertTrue(false);
        }


        Thread.sleep(2000);
        driver.quit();
    }
}
