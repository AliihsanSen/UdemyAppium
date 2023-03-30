package org.example.Android;

import io.appium.java_client.AppiumDriver;
import org.example.CreateDriverSessionOptions;

public class AndInteractsWithApps {

    public static void main(String[] args) throws Exception {

        AppiumDriver driver = CreateDriverSessionOptions.initializeDriver("Android");
    }
}
