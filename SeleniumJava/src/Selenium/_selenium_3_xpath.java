package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class _selenium_3_xpath {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:/Users/serda/Selenium/ChromeDriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://login.yahoo.com");

        driver.manage().window().maximize();
        Thread.sleep(1500);
        driver.findElement(By.id("createacc")).click();
        Thread.sleep(1500);
        driver.findElement(By.name("firstName")).sendKeys("Serdar");
        Thread.sleep(1500);
        driver.findElement(By.name("lastName")).sendKeys("KATKAR");



    }
}
