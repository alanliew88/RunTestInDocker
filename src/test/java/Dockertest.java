import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Dockertest {



    public static void main(String[] args) throws MalformedURLException, InterruptedException {



        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setBrowserName("chrome");



        /*ChromeOptions firefoxOptions = new ChromeOptions();
        firefoxOptions.setCapability("browserVersion","110");*/


        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--incognito");
        options.setAcceptInsecureCerts(true);
        options.setCapability(CapabilityType.BROWSER_NAME,"chrome");
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);

        //DesiredCapabilities capabilities = new DesiredCapabilities();
        //capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        //options.merge(capabilities);

        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver(options);

        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/"), options);
        driver.get("http://www.google.com");
        System.out.println(driver.getTitle());
        Thread.sleep(5000);
        driver.quit();



    }
}
