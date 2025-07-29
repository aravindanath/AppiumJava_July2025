package day1;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Tc02 extends BaseTestUsingOptions{

    @Test
    public void testCase01() throws InterruptedException {
        System.out.println("Executing Test Case 01");

        //android.widget.EditText[@resource-id="com.androidsample.generalstore:id/nameField"]

        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"android:id/text1\")")).click();


        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Benin\"))")).click();

        Thread.sleep(2000);

//        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Enter name here']")).sendKeys("John Doe");

        driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();

        String text = driver.findElement(AppiumBy.xpath("//android.widget.Toast[@text=\"Please enter your name\"]")).getText();

        System.out.println("Toast message: " + text);



    }
}
