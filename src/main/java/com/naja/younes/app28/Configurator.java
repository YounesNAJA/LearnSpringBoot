package com.naja.younes.app28;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@EnableConfigurationProperties
public class Configurator {
    @Value("${appconfig.app-name}")
    private String appName;
    private String appDescription;
    private String adminFirstName;
    private String adminLastName;
    private String adminEmail;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppDescription() {
        return appDescription;
    }

    public void setAppDescription(String appDescription) {
        this.appDescription = appDescription;
    }

    public String getAdminFirstName() {
        return adminFirstName;
    }

    public void setAdminFirstName(String adminFirstName) {
        this.adminFirstName = adminFirstName;
    }

    public String getAdminLastName() {
        return adminLastName;
    }

    public void setAdminLastName(String adminLastName) {
        this.adminLastName = adminLastName;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail;
    }

    @Override
    public String toString() {
        return "Configurator{" +
                "appName='" + appName + '\'' +
                ", appDescription='" + appDescription + '\'' +
                ", adminFirstName='" + adminFirstName + '\'' +
                ", adminLastName='" + adminLastName + '\'' +
                ", adminEmail='" + adminEmail + '\'' +
                '}';
    }
}
