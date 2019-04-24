package org.raccoons.backyards;

public class Rectangle extends Shape {
  private final Point position;
  private final double width;
  private final double height;

  @Override
  public String toString() {
    return super.toString() +
                   "Rectangle{" +
                   "position=" + position +
                   ", width=" + width +
                   ", height=" + height +
                   '}';
  }

  public Rectangle withPosition(Point newposition) {
    return new Rectangle(newposition, this.width, this.height);
  }

  public Rectangle withWidth(double newwidth) {
    return new Rectangle(this.position, newwidth, this.height);
  }

  public Rectangle withHeight(double newheight) {
    return new Rectangle(this.position, this.width, newheight);
  }

  Rectangle() {
    this(new Point(), 0.0, 0.0);
  }

  private Rectangle(Point p, double w, double h) {
    this.position = p;
    this.width = w;
    this.height = h;
  }
}
