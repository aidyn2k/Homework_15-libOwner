package tests;

import config.MobileConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MobileTest {

    @Test
    public void testAndroid() {
        System.setProperty("device", "android");

        MobileConfig config = ConfigFactory.create(MobileConfig.class, System.getProperties());
        assertThat(config.platformName()).isEqualTo("Android");
        assertThat(config.platformVersion()).isEqualTo("10.0");
        assertThat(config.deviceName()).isEqualTo("Google Pixel 5");
    }

    @Test
    public void testIOS() {
        System.setProperty("device", "iphone");

        MobileConfig config = ConfigFactory.create(MobileConfig.class, System.getProperties());
        assertThat(config.platformName()).isEqualTo("IOS");
        assertThat(config.platformVersion()).isEqualTo("14.8");
        assertThat(config.deviceName()).isEqualTo("iPhone 12 mini");
    }

}