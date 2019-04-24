package org.raccoons.backyards;

public class Circle extends Shape {
  private final Point center;
  private final double radius;

  @Override
  public String toString() {
    return super.toString() +
                   "Circle{" +
                   "center=" + center +
                   ", radius=" + radius +
                   '}';
  }

  public Circle withCenter(Point newcenter) {
    return new Circle(newcenter, this.radius);
  }

  public Circle withRadius(double newradius) {
    return new Circle(this.center, newradius);
  }

  Circle() {
    this(new Point(), 0.0);
  }

  private Circle(Point center, double radius) {
    this.center = center;
    this.radius = radius;
  }
}
