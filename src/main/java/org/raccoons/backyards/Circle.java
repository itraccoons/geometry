package org.raccoons.backyards;

public class Circle extends Shape {
  private final Point centre;
  private final double radius;

  @Override
  public Shape newInstance() {
    return new Circle();
  }

  @Override
  public String toString() {
    return "Circle{" + centre + "," + radius + "}";
  }

  Circle() {
    this.centre = new Point();
    this.radius = 0;
  }
}
