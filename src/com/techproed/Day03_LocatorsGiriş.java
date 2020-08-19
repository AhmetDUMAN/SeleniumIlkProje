package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day03_LocatorsGiriş {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Turkuaz\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();

        driver.get("http://a.testaddressbook.com");

        String name = "Ahmet";
        WebElement signInLinki = driver.findElement(By.id("sign-in"));
        signInLinki.click();
        WebElement emailKutusu = driver.findElement(By.id("session_email"));
        emailKutusu.sendKeys("testtechproed@gmail.com");
        WebElement sifreKutusu = driver.findElement(By.id("session_password"));
        sifreKutusu.sendKeys("Test1234!");
        WebElement singButonu =driver.findElement(By.name("commit"));
        singButonu.click();

        String başlık = driver.getTitle();

        if(başlık.equals("Address Book")){
            System.out.println("Giriş Başarılı");
        }else {
            System.out.println("Giriş başarısız.");
        }
        driver.quit();









    }
}
