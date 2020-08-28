package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day06_Facebook {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Turkuaz\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://facebook.com");
        //1. Adım
        WebElement facabookSign_inKutusu = driver.findElement(By.id("email"));
        facabookSign_inKutusu.sendKeys("testtechproed@gmail.com");
       // WebElement faceŞifre = driver.findElement(By.id("pass"));
        //faceŞifre.sendKeys("Test1234!");
        WebElement şifreKutsu = driver.findElement(By.xpath("//*[type='password'"));
        şifreKutsu.sendKeys("Test1234!");
        WebElement loginButonu = driver.findElement(By.cssSelector("#u_0_b"));
        loginButonu.click();

    }

}
