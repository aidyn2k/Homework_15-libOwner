package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:${environment}.properties")
public interface WebConfig extends Config {

    @Key("name.browser")
    @DefaultValue("chrome")
    String nameBrowser();

    @Key("version.browser")
    @DefaultValue("95")
    String versionBrowser();

    @Key("remote.url")
    String remoteUrl();
}
