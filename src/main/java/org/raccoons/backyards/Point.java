package org.raccoons.backyards;

public class Point extends Shape {
  private final double angle;
  private final double radius;

  Point() {
    this.angle = 0;
    this.radius = 0;
  }

  @Override
  public String toString() {
    return "Point"
                   + "{" + this.angle
                   + "," + this.radius
                   + "}";
  }
}
