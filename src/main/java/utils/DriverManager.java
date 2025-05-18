package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class DriverManager
{
    WebDriver webDriver;



    public DriverManager()
    {
        String browser = PropertiesReader.getProperty("browser");
        switch (browser)
        {
            case "chrome":
                ChromeOptions options = new ChromeOptions();
//                options.addArguments("--headless");
                webDriver = new ChromeDriver(options);
                break;

            case "firefox":
                FirefoxOptions ffoptions = new FirefoxOptions();
                ffoptions.addArguments("--headless");
                webDriver = new FirefoxDriver(ffoptions);
                break;

            case "edge":
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.addArguments("--headless");
                webDriver = new EdgeDriver(edgeOptions);
                break;

            case "default":
                throw new IllegalArgumentException("This Does Not Exist.");

        }
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public WebDriver getWebDriver()
    {
        return webDriver;
    }
    public void get(String url)
    {
        webDriver.get(url);
    }

}
