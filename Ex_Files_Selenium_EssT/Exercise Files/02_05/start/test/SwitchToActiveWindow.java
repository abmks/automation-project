import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/ABMKSHYAM005/Downloads/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/switch-window");
        Thread.sleep(1000);
        WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
        Thread.sleep(1000);
        newTabButton.click();

        Thread.sleep(1000);

        String originalHandle = driver.getWindowHandle();

        Thread.sleep(1000);

        for(String handle1 : driver.getWindowHandles()){
            driver.switchTo().window(handle1);
            Thread.sleep(1000);
        }

        Thread.sleep(1000);

        driver.switchTo().window(originalHandle);
        Thread.sleep(1000);
        driver.quit();
    }
}
