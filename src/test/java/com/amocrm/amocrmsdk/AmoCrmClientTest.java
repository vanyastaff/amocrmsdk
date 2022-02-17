package com.amocrm.amocrmsdk;

import java.io.InputStream;
import java.util.Properties;

import com.amocrm.amocrmsdk.auth.HashAuth;
import com.amocrm.amocrmsdk.client.Auth;
import lombok.SneakyThrows;

import static org.junit.Assert.fail;

public class AmoCrmClientTest {

    @SneakyThrows
    protected Properties getProperties() {
        try {
            Properties properties = new Properties();
            InputStream in = getClass().getResourceAsStream("/amocrm.properties");
            properties.load(in);
            in.close();
            return properties;
        } catch (Exception e) {
            fail("Failed to load amocrm client properties: " + e.getMessage());
        }
        return null;
    }

    protected Auth getAuth() {
        Properties properties = this.getProperties();
        return new HashAuth(
                properties.getProperty("amocrm.login"),
                properties.getProperty("amocrm.hash"),
                properties.getProperty("amocrm.domain")
        );
    }
}
