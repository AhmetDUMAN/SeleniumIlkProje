package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day03_LocatorsGirisTekrar {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Turkuaz\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.get("http://a.testaddressbook.com");
        WebElement  signInLink = driver.findElement(By.id("sign-in"));
        signInLink.click();
        WebElement email = driver.findElement(By.id("session_email"));
        email.sendKeys("testtechproed@gmail.com");
        WebElement sifreKutusu = driver.findElement(By.id("session_password"));
        sifreKutusu.sendKeys("Test1234!");
        WebElement giriş = driver.findElement(By.name("commit"));

        String başlıgı = driver.getTitle();
        System.out.println(başlıgı);
        if (başlıgı.equals("Address Book - Sign In")){
            System.out.println("Giriş Başarlı.");
        }else {
            System.out.println("Giriş Başarısız.");
        }
        giriş.click();

    }
}
