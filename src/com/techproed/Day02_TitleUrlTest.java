package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleUrlTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Turkuaz\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("https://youtube.com");
        String a = webDriver.getTitle();
        if (a.toLowerCase().contains("video")){
            System.out.println("var"+a);
        }else {
            System.out.println("yok : "+a);
        }
        webDriver.quit();
    }

}
