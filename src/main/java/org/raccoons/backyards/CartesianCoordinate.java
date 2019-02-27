package org.raccoons.backyards;

public class CartesianCoordinate extends Coordinate{
  private double x;
  private double y;

  public void setX(double x) {
    this.x = x;
  }

  public void setY(double y) {
    this.y = y;
  }

  public double getX() {
    return x;
  }

  public double getY() {
    return y;
  }

  public Coordinate toPolarCoordinate() {
    return new PolarCoordinate(200, Math.sqrt(x*x + y*y));
  }

  @Override
  public String toString() {
    return "CartesianCoordinate{" +
                   "x=" + x +
                   ", y=" + y +
                   '}';
  }

  CartesianCoordinate(double x, double y) {
    this.x = x;
    this.y = y;
  }

}
