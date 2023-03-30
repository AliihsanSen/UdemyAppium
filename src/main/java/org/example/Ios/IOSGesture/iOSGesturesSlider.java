package org.example.Ios.IOSGesture;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.example.CreateDriverSessionOptions;
import org.openqa.selenium.WebElement;

public class iOSGesturesSlider {
    public static void main(String[] args) throws Exception {

        AppiumDriver driver = CreateDriverSessionOptions.initializeDriver("IOS");
        slider(driver);

    }

    public static void slider(AppiumDriver driver){
        driver.findElement(MobileBy.AccessibilityId("Sliders")).click();

        WebElement element = driver.findElement(MobileBy.iOSNsPredicateString("value == \"42%\""));
        element.sendKeys("0");

        element = driver.findElement(MobileBy.iOSNsPredicateString("value == \"0%\""));
        element.sendKeys("1");
    }
}
