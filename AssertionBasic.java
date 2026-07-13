package SeleniumWebTechniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class AssertionBasic {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //Assert Equals, Assert True and Assert False
        Assert.assertFalse(driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).isSelected());
        Assert.assertFalse(false);
        driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).isSelected();
        driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).click();
        driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).isSelected();
        Assert.assertTrue(driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).isSelected());
        Assert.assertTrue(true);

        Thread.sleep(2000);
        driver.findElement(By.id("divpaxinfo")).click();
        //driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
        for (int i=1;i<5;i++) {
            driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
        }
        System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
        Assert.assertEquals(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText(),"5 Adult");
    }
}
