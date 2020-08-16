package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DOdev {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Turkuaz\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.navigate().to("https://amazon.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();


        //sayfanın başlıgını alır
        String sayfaTitle = driver.getTitle();

        //sayfanın kısa uzantısın urlsi
        String sayfaUrl   = driver.getCurrentUrl();

        System.out.println(sayfaTitle);
        System.out.println(sayfaUrl);

        driver.quit();



    }

}
