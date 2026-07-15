package Section8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class Class73 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String[] itemsneeded = {"Cucumber", "Brocolli"};
        driver.get("https://www.google.com");
        driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
        List <WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        for(int i=0; i<products.size();i++){
            String[] name = products.get(i).getText().split("-");
            String Formattedname = name[0].trim();

            List pr = Arrays.asList(itemsneeded);

            if (pr.contains(Formattedname)){
                //driver.findElements(By.xpath("//*[text()='ADD TO CART']")).get(2).click(); - To select by index value
                driver.findElements(By.xpath("//*[text()='ADD TO CART']")).get(i).click();
                System.out.println(products.get(i).getText());
            }

        }

        Thread.sleep(2000);
        driver.quit();
    }
}
