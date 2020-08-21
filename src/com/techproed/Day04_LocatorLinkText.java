package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day04_LocatorLinkText {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Turkuaz\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://a.testaddressbook.com");

        WebElement SignInLinki = driver.findElement(By.linkText("Sign in"));
        SignInLinki.click();
        WebElement partialLinki = driver.findElement(By.partialLinkText("Home"));
        partialLinki.click();


    }
}
