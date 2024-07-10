package tek.intro;
import org.openqa.selenium.chrome.ChromeDriver;
import com.sun.tools.javac.Main;

public class handleBrowser {

    public static void main(String[] args) {

        ChromeDriver chrome =new ChromeDriver();

        chrome. get("https://facebook.com");

        chrome.quit();

    }
}
