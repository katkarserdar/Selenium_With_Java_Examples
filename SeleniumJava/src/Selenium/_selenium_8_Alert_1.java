package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class _selenium_8_Alert_1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/serda/Selenium/ChromeDriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://www.demo.guru99.com/test/delete_customer.php");
        driver.manage().window().maximize();

        WebElement customer_ID = driver.findElement(By.xpath("//input[@name='cusid']"));
        customer_ID.sendKeys("asdasd");
        Thread.sleep(1500);


        WebElement submitButton = driver.findElement(By.xpath("//input[@name='submit']"));
        submitButton.click();

        Thread.sleep(1500);

        driver.switchTo().alert().accept();

        Assert.assertEquals("Customer Successfully Delete!",driver.switchTo().alert().getText());

        Thread.sleep(1500);

        //System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

    }
}
