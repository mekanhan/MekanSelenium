package foundation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class SecondTest {
    private WebDriver driver;
    @BeforeClass
    public void beforeClass(){
        WebDriverManager.chromedriver().setup();
    }
    @BeforeMethod
    public void setUp(){
        driver=new ChromeDriver();
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void testPageTitle(){
        driver.get("https://the-internet.herokuapp.com/");
        String expectedTitle=driver.getTitle();
        String actualTitle= "The Internet";
        Assert.assertEquals(actualTitle, expectedTitle,"sorry guys");
    }
    @Test
    public void testNavigateTomethod(){
        driver.get("https://the-internet.herokuapp.com/");
        WebElement abTesting=driver.findElement(By.xpath("//a[.='A/B Testing']"));
        abTesting.click();
        driver.navigate().back();
        driver.navigate().forward();
    }
}