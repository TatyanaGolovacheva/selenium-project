import junit.framework.TestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.name;


public class LoginPageTest extends TestCase {

    private WebDriverWait wait;

    @Test
    public void testLoginPageFF() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\tgolovacheva\\Documents\\GitHub\\testproject\\src\\main\\resources\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
        driver.get("http://localhost/litecart/admin/");
        driver.findElement(name("username")).sendKeys("admin");
        driver.findElement(name("password")).sendKeys("admin");
        driver.findElement(name("login")).click();


        int categoriesSize = driver.findElements(By.cssSelector("li#app-")).size();
        for (int i = 0; i < categoriesSize; i++) {
            List<WebElement> leftMenuCategories = driver.findElements(By.cssSelector("li#app-"));
            WebElement webElement = leftMenuCategories.get(i);
            webElement.click();
            driver.findElement(By.cssSelector("td#content h1"));


            int subCategoriesSize = driver.findElements(By.cssSelector("ul.docs a")).size();
            for (int x = 0; x < subCategoriesSize; x++) {
                List<WebElement> leftMenuSubCategories = driver.findElements(By.cssSelector("ul.docs a"));
                WebElement subCategories = leftMenuSubCategories.get(x);
                subCategories.click();
                driver.findElement(By.cssSelector("td#content h1"));

            }
        }

        driver.close();
    }

    @Test(enabled = false)
    public void testLoginPageCH() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tgolovacheva\\Documents\\GitHub\\testproject\\src\\main\\resources\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
        driver.get("http://localhost/litecart/admin/");
        driver.findElement(name("username")).sendKeys("admin");
        driver.findElement(name("password")).sendKeys("admin");
        driver.findElement(name("login")).click();


        int categoriesSize = driver.findElements(By.cssSelector("li#app-")).size();
        for (int i = 0; i < categoriesSize; i++) {
            List<WebElement> leftMenuCategories = driver.findElements(By.cssSelector("li#app-"));
            WebElement webElement = leftMenuCategories.get(i);
            webElement.click();
            driver.findElement(By.cssSelector("td#content h1"));


            int subCategoriesSize = driver.findElements(By.cssSelector("ul.docs a")).size();
            for (int x = 0; x < subCategoriesSize; x++) {
                List<WebElement> leftMenuSubCategories = driver.findElements(By.cssSelector("ul.docs a"));
                WebElement subCategories = leftMenuSubCategories.get(x);
                subCategories.click();
                driver.findElement(By.cssSelector("td#content h1"));

            }

        }

        driver.close();

    }

}
