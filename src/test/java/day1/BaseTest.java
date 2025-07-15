package day1;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest
{

   protected AppiumDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        System.out.println("Setting up the test environment...");
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium:automationName", "UiAutomator2");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:platformVersion", "12");
        capabilities.setCapability("appium:deviceName", "Medium Phone API 31");
        capabilities.setCapability("appium:udid", "emulator-5554");
        capabilities.setCapability("appium:appActivity", "com.androidsample.generalstore.SplashActivity");
        capabilities.setCapability("appium:appPackage", "com.androidsample.generalstore");
        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/"),capabilities);

    }
}
