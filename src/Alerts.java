import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner=new Scanner(System.in);
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SAKTHI M\\Desktop\\software_test\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        WebElement btn=driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[3]/button"));
        btn.click();

        Thread.sleep(3000);

        Alert alert=driver.switchTo().alert();
        
        Thread.sleep(3000);
        String s=scanner.nextLine();
        alert.sendKeys(s);
        alert.accept();

        Thread.sleep(10000);



    }
}