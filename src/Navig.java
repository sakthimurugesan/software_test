import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Navig {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SAKTHI M\\Desktop\\software_test\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait Wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.youtube.com");
        driver.manage().window().maximize();

        System.out.println("Opened Youtube");
        System.out.println("Getting title : "+driver.getTitle());

        Thread.sleep(1500);
        System.out.println("Navigating to amypo portal");

        driver.navigate().to("https://skcet.amypo.com/login");
        Thread.sleep(1500);

        WebElement email=driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div[2]/div/input"));
        WebElement password=driver.findElement(By.id("passwordInput"));
        WebElement submit=driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div[2]/div[2]/div/div[3]/button"));

        if (email.isDisplayed()) {
            System.out.println("Email field displayed");
        }

        else
        {
            System.out.println("Email field not displayed");

        }

        if (password.isDisplayed()) {
            System.out.println("password field displayed");
        }

        else
        {
            System.out.println("password field  not displayed");

        }

        if (submit.isEnabled()) {
            System.out.println("Submit button enabled");
        }
        else
            System.out.println("Submit button not enabled");

        driver.quit();

    }
}