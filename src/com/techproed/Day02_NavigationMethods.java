package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Turkuaz\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();

        //ekranı buyütüyor tam boyut yapıyor
        webDriver.manage().window().maximize();
        webDriver.get("https://google.com");
        webDriver.navigate().to("https://amazon.com");
        //navigate().back() komutu bir önceki sayfaya geri dönmeye yarıyor.
        webDriver.navigate().back();
        //navigate().forward(); mothodu geri geldiğimiz sayfaya fitmemizi sağlıyor
        //örnek : google -> amazona gittik -> amazondan google geri dönderir.
        //eger forward yaparsak , amazona geri dideriz.
        webDriver.navigate().forward();

        //navigate().refresh() methodu sayfayı yenilemeye yarıyor.
        webDriver.navigate().refresh();


    }
}
