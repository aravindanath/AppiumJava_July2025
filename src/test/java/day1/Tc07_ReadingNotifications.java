package day1;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.testng.annotations.Test;

public class Tc07_ReadingNotifications extends BaseTestUsingOptions{

    @Test
    public void testCase01() throws InterruptedException {
        System.out.println("Executing Test Case 01");

        Thread.sleep(2000);
       ((AndroidDriver) driver).openNotifications();

       Thread.sleep(2000);
       driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout[@resource-id=\"com.android.systemui:id/expandableNotificationRow\"]")).click();


    }
}
