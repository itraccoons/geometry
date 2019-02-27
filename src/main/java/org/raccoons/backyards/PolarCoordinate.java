package org.raccoons.backyards;

public class PolarCoordinate extends Coordinate{
  private final double theta;
  private final double distance;

  public Coordinate toCartesianCoordinate() {
    return new CartesianCoordinate(
            distance * Math.cos(theta * Math.PI / 180),
            distance * Math.sin(theta * Math.PI / 180)
    );
  }

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
