package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_Xpath01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Turkuaz\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://a.testaddressbook.com/sign_in");

     //   try {
        //Thread.sleep(3000);
     //   } catch (InterruptedException e) {
     //   }

        WebElement emailKutusu = driver.findElement(By.xpath("//input[@type='email']"));
        emailKutusu.sendKeys("testtechproed@gmail.com");
        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("Test1234!");
        WebElement sign_in = driver.findElement(By.xpath("//input[@type='submit']"));
        sign_in.click();
    }
}
