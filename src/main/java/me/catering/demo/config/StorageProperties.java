package me.catering.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("exception")
public class StorageProperties {

    private String location = "/Users/huangzhibin/IdeaProjects/Catering/files";

    private String avatarRelativeLocation = "img/avatar";

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAvatarRelativeLocation() {
        return avatarRelativeLocation;
    }

    public void setAvatarRelativeLocation(String avatarRelativeLocation) {
        this.avatarRelativeLocation = avatarRelativeLocation;
    }
}
