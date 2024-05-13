
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class MultipleWindows {

   public static void main(String[] args) {
           System.setProperty("webdriver.chrome.driver",
      "C:\\Users\\SAKTHI M\\Desktop\\software_test\\src\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();

      // Create an instance of ChromeDriver

      driver.get("https://www.google.com/");
      System.out.println(driver.getTitle());
      // Opens a new Tab and switches to new Tab
      driver.switchTo().newWindow(WindowType.TAB);
      // Opens TestSigma homepage in the newly opened window 
      driver.navigate().to("https://skcet.amypo.com/login");
      System.out.println(driver.getTitle());
      
   }
}