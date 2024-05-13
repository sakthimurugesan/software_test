import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\SAKTHI M\\Desktop\\software_test\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // start application
        driver.get("https://www.facebook.com/register");

        boolean wb=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[1]/div[1]")).isDisplayed();

        boolean wb1=driver.findElement(By.name("websubmit")).isEnabled();

        Select sl=new Select(driver.findElement(By.name("birthday_day")));

        List<WebElement> alldate=sl.getOptions();
        
        System.out.println("Create a new account message displayed "+wb);
        System.out.println("Submit button enabled "+wb1);
        System.out.println("All dates are displayed "+(alldate.size()==31));

    }
}
