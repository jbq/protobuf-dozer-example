package org.powertac.common;



public class Broker {

  private String username;
  private String password;

  private String key;
  private String queueName = null;

  private boolean enabled;

  private boolean local = false;

  private int idPrefix = 0;

  private boolean wholesale = false;

  private double cash = 0.0;

  public Broker(String username, String password, String key, String queueName) {
    this.username = username;
    this.password = password;
    this.key = key;
    this.queueName = queueName;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public String getKey() {
    return key;
  }

  public String getQueueName() {
    return queueName;
  }
}
