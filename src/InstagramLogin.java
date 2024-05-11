import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v122.indexeddb.model.Key;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

import org.checkerframework.checker.units.qual.m;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

/*
 * Insta signup
 *
 */
public class InstagramLogin{
   @SuppressWarnings("deprecation")
public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver",
      "C:\\Users\\SAKTHI M\\Desktop\\software_test\\src\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      //implicit wait
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      //URL launch
      driver.get("https://www.instagram.com/accounts/emailsignup/");
      // identify username
      WebElement emailOrPhone = driver.findElement(By.name("emailOrPhone"));
      emailOrPhone.sendKeys("727722euai053@skcet.ac.in");
      WebElement fullName = driver.findElement(By.name("fullName"));
      fullName.sendKeys("727722euai053");
      WebElement username = driver.findElement(By.name("username"));
      username.sendKeys("727722euai053");
      // identify password
      WebElement password = driver.findElement(By.name("password"));
      password.sendKeys("Y1O05Hybh8IsJ7m"+Keys.ENTER);
      Thread.sleep(5000);


      Select select=new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/section/main/div/div/div[1]/div/div[4]/div/div/span/span[1]/select")));
      select.selectByValue("1");;


      Select dayselect=new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/section/main/div/div/div[1]/div/div[4]/div/div/span/span[2]/select")));
      dayselect.selectByValue("29");;


      Select yearselect=new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/section/main/div/div/div[1]/div/div[4]/div/div/span/span[3]/select")));
      yearselect.selectByValue("2004");;


      WebElement submit1=(driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/section/main/div/div/div[1]/div/div[6]/button")));

      submit1.click();

      
      
      
   }
}