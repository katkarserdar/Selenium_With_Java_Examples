package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class _selenium_4_CssSelector {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:/Users/serda/Selenium/ChromeDriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com.tr/");
        driver.manage().window().maximize();

        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@id=\"nav-orders\"]/span[1]")).click();
        Thread.sleep(1500);

    }
}
