package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_LocatorsGiriş {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Turkuaz\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/");
        WebElement signInLink = driver.findElement(By.id("sign-in"));
        signInLink.click();
        WebElement classKulanarak = driver.findElement(By.className("form-control"));
        classKulanarak.sendKeys("testtechproed@gmail.com");
        WebElement PasswordKutusu = driver.findElement(By.id("session_password"));
        PasswordKutusu.sendKeys("Test1234!");
        WebElement signInButonu = driver.findElement(By.name("commit"));
        signInButonu.click();
    }
}
