package SeleniumWebTechniques;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class ProblemAddingItem {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String[] itemneeded = {"Cucumber","Brocolli"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        int j=0;
        List<WebElement> productlist = driver.findElements(By.cssSelector("h4.product-name"));
        for (int i=0;i<productlist.size();i++){
            String[] name = productlist.get(i).getText().split("-");
            String Formattedname = name[0].trim();

            List itemsneededlist = Arrays.asList(itemneeded);
            if (itemsneededlist.contains(Formattedname)){

                driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
                if (j==2){
                    break;
                }

            }
        }


        Thread.sleep(2000);
        driver.quit();
    }
}
