package org.raccoons.backyards;

public final class Rectangle extends Shape {
  private final Point position;
  private final double width;
  private final double height;
  private final Paint fill;
  private final Stroke stroke;

  @Override
  public String toString() {
    return "Rectangle{" +
                   "position=" + position +
                   ", width=" + width +
                   ", height=" + height +
                   ", fill=" + fill +
                   ", stroke=" + stroke +
                   '}';
  }

  public Rectangle withPosition(Point newposition) {
    return new Rectangle(newposition, this.width, this.height, this.fill, this.stroke);
  }

  public Rectangle withWidth(double newwidth) {
    return new Rectangle(this.position, newwidth, this.height, this.fill, this.stroke);
  }

  public Rectangle withHeight(double newheight) {
    return new Rectangle(this.position, this.width, newheight, this.fill, this.stroke);
  }

  public Rectangle withFill(Paint newfill) {
    return new Rectangle(this.position, this.width, this.height, newfill, this.stroke);
  }

  public Rectangle withStroke(Stroke newstroke) {
    return new Rectangle(this.position, this.width, this.height, this.fill, newstroke);
  }

  Rectangle() {
    this(new Point(), 0.0, 0.0, new Color(), new Stroke());
  }

  private Rectangle(Point p, double w, double h, Paint fill, Stroke stroke) {
    this.position = p;
    this.width = w;
    this.height = h;
    this.fill = fill;
    this.stroke = stroke;
  }
}
