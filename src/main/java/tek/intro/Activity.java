package tek.intro;

import org.openqa.selenium.chrome.ChromeDriver;

public class Activity {
    public static void main(String[] args) {

        ChromeDriver Driver = new ChromeDriver();

        Driver.get("https://dev.insurace.tekschool-students.com");

        Driver.manage().window().maximize();

        String title = Driver.getTitle();

        System.out.println(title);

        Driver.quit();
    }
}
