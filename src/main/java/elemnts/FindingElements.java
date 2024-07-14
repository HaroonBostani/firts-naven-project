package elemnts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElements {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://retail.tekschool-students.com");

        By searchInputLocator =By.id("searchInput");
        WebElement searchInputElemnet =driver.findElement(searchInputLocator);
        searchInputElemnet.sendKeys();
    }
}
