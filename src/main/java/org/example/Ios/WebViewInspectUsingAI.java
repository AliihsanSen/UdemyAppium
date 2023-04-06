package org.example.Ios;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.example.CreateDriverSessionOptions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class WebViewInspectUsingAI {

    public static void main(String[] args) throws Exception {

        AppiumDriver driver = CreateDriverSessionOptions.initializeDriver("IOS");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement iOSElement = driver.findElement(MobileBy.
                iOSNsPredicateString("type == \"XCUIElementTypeTable\""));
        Map<String, Object> params = new HashMap<>();
        params.put("direction", "up");
        params.put("element", ((RemoteWebElement) iOSElement).getId());
        driver.executeScript("mobile: swipe", params);
        // -> Scroll code for iOS ends here

        driver.findElement(MobileBy.AccessibilityId("Web View")).click();
        Thread.sleep(3000);
        System.out.println(driver.findElement(MobileBy.AccessibilityId("This is HTML content inside a WKWebView ."))
                .getAttribute("label"));

    }
}
