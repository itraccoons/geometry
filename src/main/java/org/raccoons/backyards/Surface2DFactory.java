package org.raccoons.backyards;

public class Surface2DFactory {
  private static Surface2DFactory INSTANCE = null;

  private Surface2DFactory(){
  }

  public static Surface2DFactory instance() {
    if( INSTANCE == null ){
      INSTANCE = new Surface2DFactory();
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

  public Shape newPoint(PolarCoordinate coordinate) {
    return new Point(coordinate);
  }

  public Shape newCircle() {
    return new Circle();
  }

  public Shape newCircle(Point center, double radius) {
    return new Circle(center, radius);
  }
}
