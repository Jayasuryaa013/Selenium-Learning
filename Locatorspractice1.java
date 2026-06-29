package Locators.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locatorspractice1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.id("inputUsername")).sendKeys("jack");
        driver.findElement(By.name("inputPassword")).sendKeys("john");
        driver.findElement(By.className("signInBtn")).click();
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("jack");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("jack@ja.com");
        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
        driver.findElement(By.cssSelector("input[type=text]:nth-child(3)")).sendKeys("jack@gmail.com");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("9090909090");
        driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector(("form p"))).getText());
        driver.findElement(By.cssSelector("button.go-to-login-btn")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("jack");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
        Thread.sleep(2000);

        //CSS Selector
        // if we have classname in HTML then -> tagname.classname
        // If HTML has id then -> tagname#id
        // CSS Generic Syntax -> tagname[attribute='value']
        // to check the CSS navigate to console and type -> $('p.error') like 18th line
        // By index -> tagname[attribute='value']:nth-child(Index)
        // parent to child - parenttagname childtagname
        // with partial text - tagname[attribute*='value']
        // By tagname - tagname
        //Xpath
        // Generic Syntax -> //tagname[@attribute='value']
        // to check the xpath then -> $x('xpath value') -> single wont go inside another single quote then inside xpath make the value in doublequote.
        // By index -> //tagname[@attribute='value'][index]
        // parent to child tag-> //parenttagname/childtagname[index]
        // Parent to Child  -> //parenttagname[@parent attribute='value']/childtagname[index]
        // with partial text/ regular expression - //tagname[contains(@attribute,'value')]
        // By tagname - //tagname
        // To identify based on text - //tagname[text()='value'] instead of tagname we can use * also
        // Parent to child,Sib to Sib-> //parenttagname/childtagname/Siblingtagname[index]/following-sibling::siblingtagname[index];
        // Child to Parent -> //parenttag/childtag/siblingtag[index]/parenttag::childtag/parent::parenttag/childtag

        Thread.sleep(2000);
        driver.close();
    }
}
