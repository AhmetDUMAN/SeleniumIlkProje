package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Turkuaz\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
         /*1. Yeni bir class oluşturun :Homework
         2. ChromeDriver'ı kullanarak facebook'a gidin ve sayfa başlığının(Page Title) "facebook" olup olmadığını doğrulayın, Değilse, doğru başlığı(Actual title) yazdırın.
         3. Sayfa URL'sinin facebook içerip içermediğini(contains), Değilse doğru URL'yi(Actual url) yazdırın.
         4. Ardından Navigate to https://www.walmart.com/
         5. Walmart sayfa başlığının "Walmart.com" içerip içermediğini(contains) doğrulayın
         6. Navigate back to facebook
         7. Sayfayı yenileyin(refresh)
         8. Maximize the window
         9. Close the browse*/
        String facebookTitle = driver.getTitle();
        if(facebookTitle.contains("facebook")){
            System.out.println("facebook yazısı bulunmuştur");
        }else {
            System.out.println("aranan yazı bulunamadı conrol ediniz bu linkten: "+ facebookTitle);
        }
        String facebookUrl = driver.getCurrentUrl();
        if (facebookUrl.contains("facebook")){
            System.out.println("facebok urlde bunlunmuştur.");
        }else {
            System.out.println("aradıgınız kavramı bulamadık : " + facebookUrl);
        }
        driver.navigate().to("https://www.walmart.com/");
        String walmartBaşlıgıTitle = driver.getTitle();
        if (walmartBaşlıgıTitle.contains("walmart")){
            System.out.println("walmart kelimesi bulunmuştur");
        }else {
            System.out.println("u are on a wrong page");
        }
        String wBU = driver.getCurrentUrl();
        if (wBU.contains("walmart")){
            System.out.println("var");
        }else{
            System.out.println("yok");
        }

        driver.navigate().back();
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.close();







    }
}
