package Locators.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Passwordcode {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        //driver.findElement(By.id("inputUsername")).sendKeys("John");
        String Password = getpassword(driver);
        driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("inputUsername")).sendKeys("Jackie");
        driver.findElement(By.name("inputPassword")).sendKeys(Password);
        driver.findElement(By.xpath("//input[@value='rmbrUsername']")).click();
        driver.findElement(By.xpath("//input[@value='agreeTerms']")).click();
        driver.findElement(By.className("signInBtn")).click();
        Thread.sleep(2000);
        driver.close();

    }

    public static String getpassword(WebDriver driver) throws InterruptedException {
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
        String Password1 = driver.findElement(By.cssSelector("p.infoMsg")).getText();
        String[] PasswordArray = Password1.split("'");
        String[] PasswordArray2 = PasswordArray[1].split("'");
        String Password = PasswordArray2[0];
        System.out.println(Password);
        return Password;

        //Password1 = Please use temporary password 'rahulshettyacademy' to Login.
        //PasswordArray = Please use temporary password '        rahulshettyacademy' to Login.
        //PasswordArray2 = rahulshettyacademy           ' to Login.
        //PasswordArray2 = rahulshettyacademy
    }
}
