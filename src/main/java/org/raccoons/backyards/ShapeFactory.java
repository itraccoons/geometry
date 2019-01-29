package org.raccoons.backyards;

public class ShapeFactory {
  public Shape withType(String shapeType) throws IllegalArgumentException {
    String shapeTypeStringUpperCase = shapeType.toUpperCase();

    if (shapeTypeStringUpperCase.equals("POINT")) {
      return new Point();
    }
    if (shapeTypeStringUpperCase.equals("CIRCLE")) {
      return new Circle();
    }
    throw new IllegalArgumentException("Shape type not implemented");
  }
}
