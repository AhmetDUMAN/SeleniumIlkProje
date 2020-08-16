package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_DIfElse {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Turkuaz\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.com");
        String amazonTitle = driver.getTitle();

        if(amazonTitle.toLowerCase().contains("books")){
            System.out.println("car kelimesi geçiyor : " + amazonTitle);
        }else {
            System.out.println("car kelimesi geçmiyor. : "+ amazonTitle);
        }
        driver.quit();





    }
}
