package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.WebElement;

public class AndroidGestures {

    public static void main(String[] args) throws Exception {

        AppiumDriver driver = CreateDriverSessionOptions.initializeDriver("IOS");
        driver.findElement(MobileBy.AccessibilityId("Views")).click();
        driver.findElement(MobileBy.AccessibilityId("Drag and Drop")).click();

    }

    public void longClickGesture(AppiumDriver driver ){

        WebElement element = driver.findElement(MobileBy.id("io.appium.android.apis:id/drag_dot_1"));


    }
}
