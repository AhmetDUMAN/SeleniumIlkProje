package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_Xpath02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Turkuaz\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://a.testaddressbook.com");
        WebElement head = driver.findElement(By.xpath("//h1"));
        System.out.println(head.getText());
        WebElement welcomeYazısı = driver.findElement(By.tagName("h1"));
        System.out.println(welcomeYazısı.getText());


    }
}
