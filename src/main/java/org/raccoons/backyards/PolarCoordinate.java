package org.raccoons.backyards;

public class PolarCoordinate {
  private final double theta;
  private final double distance;

  @Override
  public String toString() {
    return "PolarCoordinates{" +
                   "theta=" + theta +
                   ", distance=" + distance +
                   '}';
  }

  PolarCoordinate(double theta, double distance) {
    this.theta = theta;
    this.distance = distance;
  }

  PolarCoordinate() {
    this(0,0);
  }
}
