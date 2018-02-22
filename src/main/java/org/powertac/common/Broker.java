package org.powertac.common;


public class Broker {

    private String username;
    private String password;
    private String key;
    private String queueName;


    public Broker(String username, String password, String key, String queueName) {
        this.username = username;
        this.password = password;
        this.key = key;
        this.queueName = queueName;
    }

    public String getUsername() {
        return username;
    }

}
