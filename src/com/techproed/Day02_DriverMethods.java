package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DriverMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Turkuaz\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        //google.com'a gider.
        webDriver.get("https://google.com");
        webDriver.navigate().to("http://amazon.com");

        String sayfaTile = webDriver.getTitle();
        String sayfaUrl  = webDriver.getCurrentUrl();

        System.out.println(sayfaTile);
        System.out.println(sayfaUrl);

        webDriver.quit();








    }
}
