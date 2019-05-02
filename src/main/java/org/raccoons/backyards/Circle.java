package org.raccoons.backyards;

public final class Circle extends Shape {
  private final Point center;
  private final double radius;
  private final Paint fill;
  private final Stroke stroke;

  @Override
  public String toString() {
    return "Circle{" +
                   "center=" + center +
                   ", radius=" + radius +
                   ", fill=" + fill +
                   ", stroke=" + stroke +
                   '}';
  }

  public Circle withCenter(Point newcenter) {
    return new Circle(newcenter, this.radius, this.fill, this.stroke);
  }

  public Circle withRadius(double newradius) {
    return new Circle(this.center, newradius, this.fill, this.stroke);
  }

  public Circle withFill(Paint newfill) {
    return new Circle(this.center, this.radius, newfill, this.stroke);
  }

  public Circle withStroke(Stroke newstroke) {
    return new Circle(this.center, this.radius, this.fill, newstroke);
  }

  Circle() {
    this(new Point(), 0.0, new Color(), new Stroke());
  }

  private Circle(Point center, double radius, Paint fill, Stroke stroke) {
    this.center = center;
    this.radius = radius;
    this.fill = fill;
    this.stroke = stroke;
  }
}
