import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/*
 * LINKEDIN SIGNUP
 *
 */
public class App {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SAKTHI M\\Desktop\\software_test\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait Wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.linkedin.com/signup");
        driver.manage().window().maximize();
        WebElement firstName = driver.findElement(By.name("email-or-phone"));
        WebElement password =driver.findElement(By.name("password"));

        firstName.sendKeys("newman290904@gmail.com");
        password.sendKeys("Uum5Ws5ZOEyqneeM"+Keys.ENTER);
        WebElement fname =driver.findElement(By.name("first-name"));
        WebElement lname = driver.findElement(By.name("last-name"));
        fname.sendKeys("Sakthi");
        Thread.sleep(5000);
        lname.sendKeys("Murugesan"+Keys.ENTER);

        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='challenge-dialog']/div/section/div/div/iframe")));
        WebElement phone = Wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='register-verification-phone-number']")));
        phone.sendKeys("6382550891"+Keys.ENTER);
        

    }
}