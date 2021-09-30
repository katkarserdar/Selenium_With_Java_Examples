package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class _selenium_7_ActionClass_Drag_nd_Drop {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\serda\\Selenium\\gechoDriver\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        Actions actions = new Actions(driver);


        //Başkentler

        WebElement oslo =  driver.findElement(By.id("box1"));
        WebElement washington =  driver.findElement(By.id("box3"));
        WebElement copenhagen =  driver.findElement(By.id("box4"));
        WebElement madrid =  driver.findElement(By.id("box7"));
        WebElement stockholm =  driver.findElement(By.id("box2"));
        WebElement rome =  driver.findElement(By.id("box6"));
        WebElement seoul =  driver.findElement(By.id("box5"));


        //Ülkeler


        WebElement italy = driver.findElement(By.id("box106"));
        WebElement spain = driver.findElement(By.id("box107"));
        WebElement norway = driver.findElement(By.id("box101"));
        WebElement denmark = driver.findElement(By.id("box104"));
        WebElement southKorea = driver.findElement(By.id("box105"));
        WebElement swedan = driver.findElement(By.id("box102"));
        WebElement us = driver.findElement(By.id("box103"));


        actions.dragAndDrop(rome,italy).build().perform();
        Thread.sleep(1500);
        actions.dragAndDrop(seoul,southKorea).build().perform();
        Thread.sleep(1500);
        actions.dragAndDrop(washington,us).build().perform();
        Thread.sleep(1500);
        actions.dragAndDrop(madrid,spain).build().perform();
        Thread.sleep(1500);
        actions.dragAndDrop(stockholm,swedan).build().perform();
        Thread.sleep(1500);
        actions.dragAndDrop(oslo,norway).build().perform();
        Thread.sleep(1500);
        actions.dragAndDrop(copenhagen,denmark).build().perform();




    }
}
