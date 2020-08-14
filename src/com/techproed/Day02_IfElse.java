package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_IfElse {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Turkuaz\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.manage().window().maximize();

        webDriver.get("http://amazon.com");

        String sayfaBaşlıgı = webDriver.getTitle();
        //car kelimesini içeriyormu içermiyormu varmı yok mu

        //cpmtans methodu  bir kelimein , bir yazı içerisinde geçip geçmedigini kontol ediyordu.
        if (sayfaBaşlıgı.toLowerCase().contains("books")){
            System.out.println("car kelimesi geçiyor: "+ sayfaBaşlıgı);
        }else {
            System.out.println("car kelimesi geçmiyor: "+ sayfaBaşlıgı);
        }
        webDriver.quit();






    }
}
