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

  // Implementing the 'readResolve()' method.
  protected Object readResolve() {
    return instance();
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    throw new CloneNotSupportedException();
  }

  public Shape newPoint(){
    return new Point();
  }

  public Shape newPoint(PolarCoordinates coordinates){
    return new Point(coordinates);
  }

  public Shape newCircle(){
    return new Circle();
  }

  public Shape newCircle(Point center, double radius) {
    return new Circle(center, radius);
  }
}
