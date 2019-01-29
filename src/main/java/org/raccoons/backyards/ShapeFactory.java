package org.raccoons.backyards;

public class ShapeFactory {
  public Shape withType(String shapeType) throws IllegalArgumentException {
    if (shapeType.equals("point")) {
      return new Point();
    }
    if (shapeType.equals("circle")) {
      return new Circle();
    }
    throw new IllegalArgumentException("Shape type not implemented");
  }
}
