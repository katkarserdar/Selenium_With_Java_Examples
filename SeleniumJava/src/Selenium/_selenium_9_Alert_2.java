package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _selenium_9_Alert_2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/serda/Selenium/ChromeDriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://demo.automationtesting.in/Alerts.html");

        driver.manage().window().maximize();


        //todo  Basit Uyarılar
        driver.findElement(By.cssSelector(".btn.btn-danger")).click();
        Thread.sleep(1500);
        driver.switchTo().alert().accept();




        //todo Teyit Uyarıları
        driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
        Thread.sleep(500);

        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
        Thread.sleep(1500);
        driver.switchTo().alert().dismiss();

        Thread.sleep(1500);




        //todo input bekleyen uyarılar
        driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();

        driver.findElement(By.cssSelector(".btn.btn-info")).click();

        Thread.sleep(1500);

        driver.switchTo().alert().sendKeys("Serdar");

        Thread.sleep(2000);

        driver.switchTo().alert().accept();

        String massage = driver.findElement(By.cssSelector("#Textbox>p")).getText();

        System.out.println("Mesajım: "+massage);


    }
}
