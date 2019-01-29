package org.raccoons.backyards;

public class Circle extends Shape {
  private final Point centre;
  private final double radius;

  Circle() {
    this.centre = new Point();
    this.radius = 0;
  }

  @Override
  public String toString() {
    return "Circle"
                   + "{" + this.centre
                   + "," + this.radius
                   + "}";
  }
}
