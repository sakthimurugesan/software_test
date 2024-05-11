import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragnDrop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\SAKTHI M\\Desktop\\software_test\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();

        // WebElement on which drag and drop operation needs to be performed
        WebElement fromElement = driver
                .findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[2]"));

        // WebElement to which the above object is dropped
        WebElement toElement = driver.findElement(By.xpath(
                "/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[2]/table/tbody/tr/td[2]/div/div/ol"));

        // Creating object of Actions class to build composite actions
        Actions builder = new Actions(driver);

        // Building a drag and drop action
        Action dragAndDrop = builder.clickAndHold(fromElement)
                .moveToElement(toElement)
                .release(toElement)
                .build();

        // Performing the drag and drop action
        dragAndDrop.perform();

    }

}
