import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavDragAlert {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\SAKTHI M\\Desktop\\software_test\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        WebElement btn = driver.findElement(By.xpath("/html/body/div[2]/div/div/ul/li[3]/button"));
        btn.click();

        Thread.sleep(3000);

        Alert alert = driver.switchTo().alert();

        Thread.sleep(3000);
        String s = scanner.nextLine();
        alert.sendKeys(s);
        alert.accept();

        driver.navigate().to("http://demo.guru99.com/test/drag_drop.html");
        ;
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

        // WebElement on which drag and drop operation needs to be performed
        fromElement = driver
                .findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[6]"));

        // WebElement to which the above object is dropped
        toElement = driver.findElement(By.xpath(
                "/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[2]/table/tbody/tr/td[1]/div/div/ol"));

        // Creating object of Actions class to build composite actions
        builder = new Actions(driver);

        // Building a drag and drop action
        dragAndDrop = builder.clickAndHold(fromElement)
                .moveToElement(toElement)
                .release(toElement)
                .build();

        // Performing the drag and drop action
        dragAndDrop.perform();

        // WebElement on which drag and drop operation needs to be performed
        fromElement = driver
                .findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[5]"));

        // WebElement to which the above object is dropped
        toElement = driver.findElement(By.xpath(
                "/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[1]/div/div/ol"));

        // Creating object of Actions class to build composite actions
        builder = new Actions(driver);

        // Building a drag and drop action
        dragAndDrop = builder.clickAndHold(fromElement)
                .moveToElement(toElement)
                .release(toElement)
                .build();

        // Performing the drag and drop action
        dragAndDrop.perform();

        // WebElement on which drag and drop operation needs to be performed
        fromElement = driver
                .findElement(By.xpath("/html/body/section/div/div/main/div/div/div/div/div/div/div[1]/div/ul/li[2]"));

        // WebElement to which the above object is dropped
        toElement = driver.findElement(By.xpath(
                "/html/body/section/div/div/main/div/div/div/div/div/div/table/tbody/tr/td[1]/table/tbody/tr/td[2]/div/div/ol"));

        // Creating object of Actions class to build composite actions
        builder = new Actions(driver);

        // Building a drag and drop action
        dragAndDrop = builder.clickAndHold(fromElement)
                .moveToElement(toElement)
                .release(toElement)
                .build();

        // Performing the drag and drop action
        dragAndDrop.perform();

    }
}
