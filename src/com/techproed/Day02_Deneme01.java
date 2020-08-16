package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_Deneme01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Turkuaz\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        driver.navigate().to("https://youtube.com");
        driver.navigate().back();
        //navigate().back() komutu bir önceki sayfaya dönderir
        driver.navigate().forward();
        //nagivate().forward() methodu geri geldigimizş sayfaya gitmemize yarıyor
        driver.navigate().refresh();
        //navigate().refresh() sayfayı yeniler.
        driver.manage().window().maximize();




    }
}
