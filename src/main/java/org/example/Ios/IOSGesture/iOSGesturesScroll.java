package org.example.Ios.IOSGesture;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.example.CreateDriverSessionOptions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.HashMap;
import java.util.Map;

public class iOSGesturesScroll {

    public static void main(String[] args) throws Exception {

        AppiumDriver driver = CreateDriverSessionOptions.initializeDriver("IOS");
        scrollGesture(driver);
    }
    public static void scrollGesture(AppiumDriver driver) {
        Map<String, Object> params = new HashMap<>();
        params.put("direction", "down");
        driver.executeScript("mobile: scroll", params);


        /* WebElement parentElement = driver.findElement(AppiumBy.
                iOSNsPredicateString("type == \"XCUIElementTypeTable\""));
                */

        WebElement childElement = driver.findElement(MobileBy.
                AccessibilityId("Activity Indicators"));
        params = new HashMap<>();
        // params.put("direction", "down");
        params.put("elementId", ((RemoteWebElement) childElement).getId());
        // params.put("name", "Web View");
        // params.put("predicateString", "label == \"Web View\"");
        params.put("toVisible", true);
        driver.executeScript("mobile: scroll", params);
    }
}
