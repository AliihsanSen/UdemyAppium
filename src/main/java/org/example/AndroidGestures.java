package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

public class AndroidGestures {

    public static void main(String[] args) throws Exception {

        AppiumDriver driver = CreateDriverSessionOptions.initializeDriver("IOS");
        driver.findElement(MobileBy.AccessibilityId("Views")).click();
        driver.findElement(MobileBy.AccessibilityId("Drag and Drop")).click();

    }

    public void longClickGesture(AppiumDriver driver ){


    }
}
