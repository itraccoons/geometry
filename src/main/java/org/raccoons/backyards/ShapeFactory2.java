package org.raccoons.backyards;

public class ShapeFactory2 {
  private static ShapeFactory2 INSTANCE = null;

  private ShapeFactory2(){
  }

  public static ShapeFactory2 instance() {
    if( INSTANCE == null ){
      INSTANCE = new ShapeFactory2();
    }
    return INSTANCE;
  }

  // Preventing issue of destroying Singleton design by serialization
  protected Object readResolve() {
    return instance();
  }

  // Preventing issue of destroying Singleton design by cloning
  @Override
  protected Object clone() throws CloneNotSupportedException {
    throw new CloneNotSupportedException();
  }

  public Plane newPlane() {
    return new Plane();
  }

  public PolarCoordinate newPolarCoordinate(double theta, double distance) {
    return new PolarCoordinate(theta, distance);
  }

  public Shape newPoint() {
    return new Point();
  }

  public Shape newPoint(PolarCoordinate coordinates) {
    return new Point(coordinates);
  }

  public Shape newCircle() {
    return new Circle();
  }

  public Shape newCircle(Point center, double radius) {
    return new Circle(center, radius);
  }
}
