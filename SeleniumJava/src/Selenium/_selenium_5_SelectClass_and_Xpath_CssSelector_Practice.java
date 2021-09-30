package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _selenium_5_SelectClass_and_Xpath_CssSelector_Practice {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\serda\\Selenium\\gechoDriver\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();

        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        driver.findElement(By.name("firstname")).sendKeys("Serdar");
        Thread.sleep(1000);

        WebElement soyisim = driver.findElement(By.name("lastname"));
        soyisim.sendKeys("KATKAR");

        driver.findElement(By.xpath("//*[@id=\"sex-0\"]")).click();



        List<WebElement> ecperinces = driver.findElements(By.xpath("(//div[@class='control-group'])[5]//input"));
        for(WebElement experience:ecperinces){

            experience.click();
            Thread.sleep(400);
        }

        WebElement date = driver.findElement(By.cssSelector("#datepicker"));
        date.sendKeys("18.09.2021");

        driver.findElement(By.xpath("//*[@id=\"profession-1\"]")).click();

        List<WebElement> tools = driver.findElements(By.xpath("(//div[@class='control-group'])[7]//input"));
        for(WebElement tool:tools){

            tool.click();
            Thread.sleep(400);
        }

        //Select Class

        WebElement element = driver.findElement(By.cssSelector("#continents"));
        Select slc = new Select(element);
        slc.selectByVisibleText("Australia");

        element = driver.findElement(By.cssSelector("#selenium_commands"));
        slc = new Select(element);

        slc.selectByIndex(0);
        slc.selectByIndex(1);



    }
}
