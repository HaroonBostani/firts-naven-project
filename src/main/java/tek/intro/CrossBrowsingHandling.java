package tek.intro;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import java.util.Scanner;

public class CrossBrowsingHandling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser chorme or firefox");

        String browserType = scanner.next();

        WebDriver driver;

        if(browserType.equals("Chrome")) {
            driver.new ChromeDriver();

        }else if (browserType.equals("firefox")) {
             driver.new firefoxDriver();

        } else {
            throw new RuntimeException("Worng driver");
        }

        driver.get("https://google.com");
    }
}
