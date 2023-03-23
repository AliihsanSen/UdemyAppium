package org.example.IOSGesture;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.example.CreateDriverSessionOptions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.HashMap;
import java.util.Map;

public class iOSGesturesPinch {

    public static void main(String[] args) throws Exception {

        AppiumDriver driver = CreateDriverSessionOptions.initializeDriver("IOS");
        pinchGesture(driver);

    }
    public static void pinchGesture(AppiumDriver driver){
        // driver.findElement(AppiumBy.
        // iOSClassChain("**/XCUIElementTypeButton[`label == \"Continue\"`]")).click();

        Map<String, Object> params1 = new HashMap<>();
        params1.put("scale", 20);
        params1.put("velocity", 2.2);
        driver.executeScript("mobile: pinch", params1);

        WebElement element = driver.findElement(MobileBy.
                iOSClassChain("**/XCUIElementTypeOther[`name == \"OverlayView\"`][1]"));

        Map<String, Object> params2 = new HashMap<>();
        params2.put("elementId", ((RemoteWebElement) element).getId());
        params2.put("scale", 0.1);
        params2.put("velocity", -2.2);
        driver.executeScript("mobile: pinch", params2);

    }
}
