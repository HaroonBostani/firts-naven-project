package tek.intro;

import org.openqa.selenium.edge.EdgeDriver;

public class CrossBrowsing {

    public static void main(String[] args) {

        EdgeDriver driver = new EdgeDriver();

        driver.get("https://google.com");
        driver.manage().window().maximize();

        String title = driver.getTitle();

        System.out.println(title);

        //driver.quit();
    }
}
