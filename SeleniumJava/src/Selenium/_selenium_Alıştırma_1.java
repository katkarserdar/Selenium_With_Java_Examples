package Selenium;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _selenium_Alıştırma_1 {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:/Users/serda/Selenium/ChromeDriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.tutorialsninja.com/demo/index.php?route=common%2Fhome");
        driver.manage().window().maximize();


        WebElement myAccount = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]"));
        myAccount.click();
        Thread.sleep(1500);

        WebElement register = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a"));
        register.click();
        Thread.sleep(1500);

        driver.findElement(By.name("firstname")).sendKeys("serdar");
        Thread.sleep(1500);

        driver.findElement(By.name("lastname")).sendKeys("katkar");
        Thread.sleep(1500);

        String mail = "serdar1345@gmail.com";
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys(mail);
        Thread.sleep(1500);

        String telnumber = "01234567825";
        WebElement telfoneNo = driver.findElement(By.xpath("(//input[@class='form-control'])[4]"));
        telfoneNo.sendKeys(telnumber);
        Thread.sleep(1500);

        String password = "7825";
        WebElement paswords = driver.findElement(By.xpath("(//input[@class='form-control'])[5]"));
        paswords.sendKeys(password);
        Thread.sleep(1500);

        WebElement paswordConfirm = driver.findElement(By.xpath("(//input[@class='form-control'])[6]"));
        paswordConfirm.sendKeys(password);
        Thread.sleep(1500);

        driver.findElement(By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input")).click();
        Thread.sleep(1500);

        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]")).click();
        Thread.sleep(1500);

        driver.findElement(By.xpath("//input[@value='Continue']")).click();
        Thread.sleep(5000);

        //driver.quit();

        String myMassage = "Your Account Has Been Created!";

        Assert.assertEquals(myMassage,driver.getTitle());

        System.out.println("Hesabınız başarı ile oluşturulmuştur.");











    }
}
