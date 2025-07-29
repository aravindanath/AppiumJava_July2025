package day1;

import io.appium.java_client.AppiumBy;
import org.testng.annotations.Test;

public class Tc04 extends BaseTestUsingOptions{

    @Test
    public void testCase01() throws InterruptedException {
        System.out.println("Executing Test Case 01");

        //android.widget.EditText[@resource-id="com.androidsample.generalstore:id/nameField"]

        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"android:id/text1\")")).click();


        driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"Benin\"))")).click();

        Thread.sleep(2000);

        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Enter name here']")).sendKeys("John Doe");

        driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();

        String shoes [] = {"Jordan 6 Rings", "Air Jordan 4 Retro", "Air Jordan 9 Retro"};

        for (String shoe : shoes) {
            driver.findElement(AppiumBy.androidUIAutomator(
                    "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(new UiSelector().text(\"" + shoe + "\"))"));

            Thread.sleep(2000);

            driver.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productName\" and @text=\"" + shoe + "\"]//following-sibling::android.widget.LinearLayout[2]/android.widget.TextView[2][@text='ADD TO CART']")).click();
        }


    }
}
