package ru.nadobnaya.config;

import org.aeonbits.owner.Config;

@EmulatorConfig.LoadPolicy(EmulatorConfig.LoadType.MERGE)
@Config.Sources({
        "classpath:emulator.properties"
})

public interface EmulatorConfig extends Config {

    @Key("appiumServer")
    String appiumServer();

    @Key("deviceName")
    String deviceName();

    @Key("platformVersion")
    String platformVersion();

    @Key("appURL")
    String appURL();

    @Key("appPath")
    String appPath();

    @Key("appPackage")
    String appPackage();

    @Key("appActivity")
    String appActivity();
}
