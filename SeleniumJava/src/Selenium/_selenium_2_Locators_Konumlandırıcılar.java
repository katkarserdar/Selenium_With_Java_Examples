package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class _selenium_2_Locators_Konumlandırıcılar {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:/Users/serda/Selenium/ChromeDriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        driver.manage().window().maximize();

        driver.findElement(By.name("q")).sendKeys("Java");

        Thread.sleep(1000);//1000 = 1sn

        driver.findElement(By.className("gNO89b")).click();

    }
}
