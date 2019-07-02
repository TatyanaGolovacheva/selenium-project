import junit.framework.TestCase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class OpenPageTest extends TestCase {


    @Test
    public void testOpenPage() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\tgolovacheva\\Documents\\GitHub\\testproject\\src\\main\\resources\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://software-testing.ru/");
        driver.close();
    }
//тестовая строка

}