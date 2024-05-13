import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.setProperty("webdriver.chrome.driver","C:\\Users\\SAKTHI M\\Desktop\\software_test\\src\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/SAKTHI%20M/Desktop/software_test/src/index.html");
        driver.manage().window().maximize();


        int row=in.nextInt();
        int col=in.nextInt();


        WebElement elements=driver.findElement(By.xpath("//table[@id='tb1']//tr["+String.valueOf(row)+"]/td["+String.valueOf(col)+"]"));


        System.out.println(elements.getText());

        driver.quit();




    }
}