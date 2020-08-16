package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DDriverOdev {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Turkuaz\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        String titleGoogle = driver.getTitle();
        System.out.println(titleGoogle);
        driver.navigate().to("https://youtube.com");
        String titleYoutube = driver.getTitle();
        System.out.println(titleYoutube);
        String urlYoutube   = driver.getCurrentUrl();
        System.out.println(urlYoutube);
        driver.navigate().back();
        String urlGoogle = driver.getCurrentUrl();
        System.out.println(urlGoogle);
        driver.quit();



    }
}
