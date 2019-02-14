package org.raccoons.backyards;

public class PolarCoordinates {
  private final double theta;
  private final double distance;

  @Override
  public String toString() {
    return "PolarCoordinates{" +
                   "theta=" + theta +
                   ", distance=" + distance +
                   '}';
  }

  PolarCoordinates(double theta, double distance) {
    this.theta = theta;
    this.distance = distance;
  }

  PolarCoordinates() {
    this(0,0);
  }
}
