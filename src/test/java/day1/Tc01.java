package day1;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Tc01 extends BaseTestUsingOptions{

    @Test
    public void testCase01() {
        System.out.println("Executing Test Case 01");

        //android.widget.EditText[@resource-id="com.androidsample.generalstore:id/nameField"]

        driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().resourceId(\"android:id/text1\")")).click();

        List<WebElement> list = driver.findElements(AppiumBy.xpath("//android.widget.ListView/android.widget.TextView"));

        System.out.println("List size: " + list.size());
        for (WebElement element : list) {
            System.out.println("Element text: " + element.getText());
            if (element.getText().equals("Argentina")) {
                element.click();
                break;
            }
        }

//        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Enter name here']")).sendKeys("John Doe");

        driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();

        String text = driver.findElement(AppiumBy.xpath("//android.widget.Toast[@text=\"Please enter your name\"]")).getText();

        System.out.println("Toast message: " + text);



    }
}
