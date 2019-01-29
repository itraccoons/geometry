package org.raccoons.backyards;

public class GeometryShapes {
  public static void main(String[] args) {
    ShapeFactory shape = new ShapeFactory();

    Shape point = shape.withType("point");
    Shape circle = shape.withType("circle");
    // Shape triangle = shape.withType("triangle");

    System.out.println(point);
    System.out.println(circle);
  }
}
