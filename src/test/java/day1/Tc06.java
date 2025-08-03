package day1;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class Tc06 extends BaseTestUsingOptions{

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


        driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();

        Thread.sleep(2000);

        //android.widget.TextView[@resource-id="com.androidsample.generalstore:id/productName" and @text="Air Jordan 9 Retro"]//following-sibling::android.widget.LinearLayout[2]
        scrollToEndWithUiSelector();


        List<WebElement> price = driver.findElements(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productPrice\"]"));

        float total = 0.0f;
        for (WebElement element : price) {
            String priceText = element.getText().replace("$", "");
            double priceValue = Double.parseDouble(priceText); // Type conversion from String to double
//            total += priceValue;
            total = (float) (total + priceValue); // Alternative way to add
        }

        System.out.println("Total price of all items in cart: $" + total);

       String finalPrice = driver.findElement(AppiumBy.id("totalAmountLbl")).getText();

        finalPrice = finalPrice.replace("$", "");
        float finalPriceValue = Float.parseFloat(finalPrice); // Type conversion from String to double

        System.out.println("Final price displayed: $" + finalPriceValue);

        if (total == finalPriceValue) {
            System.out.println("Total price matches the final price displayed.");
        } else {
            System.out.println("Total price does not match the final price displayed.");
        }

    }


    // Method to scroll to the end using UiSelector and UiScrollable
    public void scrollToEndWithUiSelector() {
        driver.findElement(AppiumBy.androidUIAutomator(
            "new UiScrollable(new UiSelector().scrollable(true)).flingToEnd(10)"));
    }
}
