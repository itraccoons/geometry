package org.raccoons.backyards;

public class Coordinates {
  private final double theta;
  private final double distance;


  @Override
  public String toString() {
    return "Coordinates{" +
                   "theta=" + theta +
                   ", distance=" + distance +
                   '}';
  }

  Coordinates() {
    this(0,0);
  }

  Coordinates(double theta, double distance) {
    this.theta = theta;
    this.distance = distance;
  }

}
