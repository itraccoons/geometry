package org.raccoons.backyards;

import java.util.Properties;

public class LAFDefaults {
  private final static LAFDefaults soleInstance = new LAFDefaults();
  private final Properties defaultProperties = new Properties();

  public static LAFDefaults getInstance() {
    return soleInstance;
  }

  private LAFDefaults() {
  }
}
