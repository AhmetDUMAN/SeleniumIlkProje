package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DTitleUrlTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Turkuaz\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://youtube.com");
        String SBY = driver.getCurrentUrl();

        if (SBY.toLowerCase().contains("video")){
            System.out.println("video kelimesini içeriyor : " + SBY);
        }else {
            System.out.println("video kelimei yoktur : " + SBY);

        }
        driver.close();




    }

}
