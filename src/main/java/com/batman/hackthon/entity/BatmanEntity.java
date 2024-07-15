package com.batman.hackthon.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BatmanEntity {

    /**
     * "applicationName": "CIC-Claims Interest Calculator",
     *         "env": "development",
     *         "errorMessage": "Not able to fetch activities list due to DB connection issue!",
     *         "operatingSystem": "Windows",
     *         "browser": "Google Chrome",
     *         "browserVersion": "126",
     *         "apiEndpoint": "/activities"
     */
    private String issueNumber;
    private String applicationName;
    private String env;
    private String errorMessage;
    private String operatingSystem;
    private String browser;
    private String browserVersion;
    private String apiEndpoint;
    private String status;


}
