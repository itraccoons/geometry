package org.raccoons.backyards;

public class Point extends Shape {
  private final double theta;
  private final double distance;

  @Override
  public Shape newInstance() {
    return new Point();
  }

  @Override
  public String toString() {
    return "Point{" + theta + "," + distance + "}";
  }

  Point() {
    this(0,0);
  }

  Point(double theta, double distance) {
    this.theta = theta;
    this.distance = distance;
  }
}
