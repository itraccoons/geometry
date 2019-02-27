package org.raccoons.backyards;

public class Circle extends Shape {
  private Coordinate center;
  private double radius;

  public Coordinate center() {
    return center;
  }

  public double radius() {
    return radius;
  }

  public void setCenter(Coordinate c) {
    this.center = c;
  }

  public void setRadius(double r) {
    this.radius = r;
  }

  @Override
  public String toString() {
    return "Circle{" +
                   "center=" + center +
                   ", radius=" + radius +
                   '}';
  }

  Circle(Coordinate center, double radius) {
    this.center = center;
    this.radius = radius;
  }
}
