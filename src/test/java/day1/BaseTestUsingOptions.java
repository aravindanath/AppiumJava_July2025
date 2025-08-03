package day1;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseTestUsingOptions
{

   protected AppiumDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        System.out.println("Setting up the test environment...");
        UiAutomator2Options options = new UiAutomator2Options();
        options.setAutomationName("UiAutomator2");
        options.setPlatformName("Android");
        options.setPlatformVersion("16");
//        options.setDeviceName("Medium Phone API 31");
        options.setDeviceName("Pixel 6a");
        options.setUdid("33161JEGR13615");
        options.setAppActivity("com.androidsample.generalstore.SplashActivity");
        options.setAppPackage("com.androidsample.generalstore");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

    }
}
