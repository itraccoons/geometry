package org.raccoons.backyards;

public class Rectangle extends Shape {
  private double width;
  private double height;
  private Coordinate position;

  public double width() {
    return width;
  }

  public double height() {
    return height;
  }

  public Coordinate position() {
    return position;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public void setPosition(Coordinate position) {
    this.position = position;
  }

  @Override
  public String toString() {
    return "Rectangle{" +
                   "width=" + width +
                   ", height=" + height +
                   ", position=" + position +
                   '}';
  }

  Rectangle(double w, double h, Coordinate p) {
    this.width = w;
    this.height = h;
    this.position = p;
  }
  //Rectangle(double width, double height, Coordinate position, Style style)
}
