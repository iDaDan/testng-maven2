package Samples;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Gecko_Driver {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\DKhramtsov\\Downloads\\geckodriver-v0.18.0-win64");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.toolsqa.com");

        Thread.sleep(5000);
        driver.quit();
    }
}