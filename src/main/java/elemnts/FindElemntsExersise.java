package elemnts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElemntsExersise {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://retail.tekschool-students.com/");

          By signInlocator = By.id("signinLink");
          WebElement signInElement = driver.findElement(signInlocator);
          signInElement.click();

            By newAccountlocator = By.id("newAccountBtn");
            WebElement newAccountElemnt = driver.findElement(newAccountlocator);
            newAccountElemnt.click();

            By namelocator = By.id("nameInput");
            WebElement nameElemnt = driver.findElement(namelocator);
            nameElemnt.sendKeys("Mohmmad");

            By EmailLocator = By.id("emailInput");
            WebElement emailElemnt = driver.findElement(EmailLocator);
            emailElemnt.sendKeys("F");

            By passwordsLocator = By.id("passwordInput");
            WebElement passwordElemnt = driver.findElement(passwordsLocator);
            emailElemnt.sendKeys("Haroon");

             By confirmpasswordlLocator = By.id("confirmPasswordInput");
             WebElement confirmpasswordElemnt = driver.findElement(confirmpasswordlLocator);
             emailElemnt.sendKeys("Haroon");

             By singuplocator = By.id("signupBtn");
             WebElement singupElemnt = driver.findElement(singuplocator);
             singupElemnt.click();




















    }
}
