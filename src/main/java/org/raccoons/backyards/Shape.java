package org.raccoons.backyards;

public abstract class Shape {
  public String type() {
    return getClass().getSimpleName();
  }
}
