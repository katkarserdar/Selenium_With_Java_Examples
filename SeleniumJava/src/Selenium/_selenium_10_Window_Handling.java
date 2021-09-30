package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class _selenium_10_Window_Handling {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/serda/Selenium/ChromeDriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.demo.guru99.com/popup.php");
        driver.manage().window().maximize();

        String firstWin = driver.getWindowHandle();
        String firstWinURL = driver.getCurrentUrl();

        System.out.println("Başlangıç Pencerem:  "+firstWinURL);

        WebElement clickHere1 = driver.findElement(By.xpath("//p//a"));
        clickHere1.click();


        Set<String> windowAllWindows = driver.getWindowHandles();
        for (String window:windowAllWindows){
            driver.switchTo().window(window);
        }
        Thread.sleep(1500);
        driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("serdar@gmail.com");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//input[@name='btnLogin']")).click();


        System.out.println("2. pencerenin URL'si: "+driver.getCurrentUrl());


        Thread.sleep(1500);
        driver.close();

        driver.switchTo().window(firstWin);
        Thread.sleep(1500);

        System.out.println("Şuanki url: "+driver.getCurrentUrl());

        Thread.sleep(2000);
        driver.quit();

    }
}
