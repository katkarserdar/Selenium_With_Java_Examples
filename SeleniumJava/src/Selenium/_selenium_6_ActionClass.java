package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _selenium_6_ActionClass {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver","C:\\Users\\serda\\Selenium\\gechoDriver\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://www.etsy.com/");


        Actions action = new Actions(driver);

        List<WebElement> menubars = driver.findElements(By.xpath("//ul[@role='menubar']//li"));

        for(WebElement menubar:menubars){

            action.moveToElement(menubar).perform();

            Thread.sleep(1000);
        }



    }
}
