package com.techproed;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {

    public static void main(String[] args) {
        //java projemize, chromedriver'ı tanıttık.
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Turkuaz\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        //selenium ile ilgili il kodumuz.
        //webDriver nesnesi oluşturarrak, chrome driverı kullanabilir hale getirdik.
        WebDriver webDriver = new ChromeDriver();
        //driver'ımıza goole.com a gitmesini söyledik.
        webDriver.get("https://google.com");
         //driverımızda açık olan pencereyi kapatır.
        //webDriver.close();
        //driverimi kople kaparıyor
       // webDriver.quit();





    }


}
