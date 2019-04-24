package org.raccoons.backyards;

public class Point extends Shape {
  private final double coordinateX;
  private final double coordinateY;

  @Override
  public String toString() {
    return super.toString() +
                   "Point{" +
                   "coordinateX=" + coordinateX +
                   ", coordinateY=" + coordinateY +
                   '}';
  }

  public double getX() {
    return this.coordinateX;
  }
  public double getY() {
    return this.coordinateY;
  }

  public Point withX(double newX) {
    return new Point(newX, this.coordinateY);
  }

  public Point withY(double newY) {
    return new Point(this.coordinateX, newY);
  }

  public Point() {
    this(0.0,0.0);
  }

  private Point(double x, double y) {
    this.coordinateX = x;
    this.coordinateY = y;
  }
}
