package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _selenium_1_ChromeDriver_Yapısı {
    public static void main(String[] args) {

    System.setProperty("webdriver.chrome.driver","C:/Users/serda/Selenium/ChromeDriver/chromedriver.exe");

    WebDriver driver = new ChromeDriver();

    driver.get("https://www.java.com/tr/");

    driver.manage().window().maximize();

    }
}
