package day1;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Tc07_usingKeyboard extends BaseTestUsingOptions{

    @Test
    public void testCase01() throws InterruptedException {
        System.out.println("Executing Test Case 01");

        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Enter name here']")).click();

        ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.A));
        ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.B));
        ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.C));
        ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.D));
        ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.E));
        ((AndroidDriver)driver).pressKey(new KeyEvent(AndroidKey.F));



       ((AndroidDriver) driver).hideKeyboard();


    }
}
