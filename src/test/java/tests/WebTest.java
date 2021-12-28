package tests;

import config.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WebTest {

    @Test
    public void webLocalTest() {
        System.setProperty("environment", "local");

        WebConfig webConfig = ConfigFactory.create(WebConfig.class, System.getProperties());
        assertThat(webConfig.nameBrowser()).isEqualTo("chrome");
        assertThat(webConfig.versionBrowser()).isEqualTo("95");
    }

    @Test
    public void webRemoteTest() {
        System.setProperty("environment", "remote");

        WebConfig webConfig = ConfigFactory.create(WebConfig.class, System.getProperties());
        assertThat(webConfig.nameBrowser()).isEqualTo("chrome");
        assertThat(webConfig.versionBrowser()).isEqualTo("95");
        assertThat(webConfig.remoteUrl()).isEqualTo("https://user1:1234@selenoid.autotests.cloud/wd/hub/");
    }


}
