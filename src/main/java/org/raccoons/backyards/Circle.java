package org.raccoons.backyards;

public class Circle extends Shape {
  private final Point center;
  private final double radius;

  @Override
  public String toString() {
    return "Circle{" +
                   "center=" + center +
                   ", radius=" + radius +
                   '}';
  }

  Circle() {
    this(new Point(),0);
  }

  Circle(Point center, double radius) {
    this.center = center;
    this.radius = radius;
  }
}
