import java.time.Duration;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.webaudio.WebAudio;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.errorprone.annotations.Keep;

public class aympo {
    /*
     * AMYPO LOGIN
     *
     */
   public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\SAKTHI M\\Desktop\\software_test\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait Wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://skcet.amypo.com/login");
        driver.manage().window().maximize();

        
        System.out.println("Navigating to amypo portal");

        Thread.sleep(1500);

        WebElement email=driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div[2]/div/input"));
        email.sendKeys("727722euai053@skcet.ac.in");
        WebElement password=driver.findElement(By.id("passwordInput"));
        password.sendKeys("727722EUAI053");
        WebElement submit=driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div[2]/div/div[3]/button"));

        submit.click();

        Thread.sleep(6000);

        WebElement couse=driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/a"));

        couse.click();

        
        WebElement st=driver.findElement(By.xpath("/html/body/main/div[2]/div[2]/a[3]"));

        st.click();


        WebElement dd=driver.findElement(By.xpath("/html/body/main/div[3]/div[1]/div[3]/div[1]"));

        dd.click();


        

       
        

        WebElement tt=driver.findElement(By.xpath("/html/body/main/div[3]/div[2]/div/div/div[2]/div[3]/div[1]/div/div[1]/div[2]/button"));

        tt.click();




        
        

   } 
}
