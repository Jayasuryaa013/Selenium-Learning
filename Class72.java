package Section8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class72 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        // How to formatting the Code in intellij : ctrl+ alt+ l
        // Naming convention in defining class, variables and Method names //camelcase
        // 1. Whenever we write a class name first character should be Capital letter and ramaining small,
        // 2. Variable names should always start with Capital letter- in between we can give a capital letter.




        Thread.sleep(2000);
        driver.quit();
    }
}
