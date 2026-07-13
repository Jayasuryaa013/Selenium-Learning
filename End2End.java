package SeleniumWebTechniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class End2End {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='MAA']")).click();
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='GOI']")).click();
        driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-active']")).click();
        driver.findElement(By.id("divpaxinfo")).click();

        Thread.sleep(2000);
        for (int i=1;i<5;i++){
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        //driver.findElement(By.cssSelector("select[name='ctl00$mainContent$DropDownListCurrency']")).click();
        WebElement Dropdown = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
        Select Dropdown1 = new Select(Dropdown);
        Dropdown1.selectByValue("INR");
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

        Thread.sleep(2000);
        driver.quit();
    }
}
