package org.example.IOSGesture;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.example.CreateDriverSessionOptions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.HashMap;
import java.util.Map;

public class iOSGesturesTouchAndHold {

    public static void main(String[] args) throws Exception {

        AppiumDriver driver = CreateDriverSessionOptions.initializeDriver("IOS");
        touchAndHold(driver);
    }
    public static void touchAndHold(AppiumDriver driver){
        driver.findElement(MobileBy.AccessibilityId("Steppers")).click();

        WebElement element = driver.findElement(MobileBy
                .iOSClassChain("**/XCUIElementTypeButton[`label == \"Increment\"`][1]"));

        Map<String, Object> params = new HashMap<>();
        params.put("elementId", ((RemoteWebElement) element).getId());
        params.put("duration", 5);
        driver.executeScript("mobile: touchAndHold", params);

    }
}
