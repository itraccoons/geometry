package org.raccoons.backyards;

public class GeometryShapes {

  public static void main(String[] args) {

    /*
    version 0

    ShapeFactory factory = new ShapeFactory();

    Shape p1 = factory.newPoint();
    Shape c1 = factory.newCicle();

    Plane plane = new Plane();

    plane.addShape(p1);
    plane.addShape(c1);

    plane.showShapes();
    */

    ShapeFactory point = PointFactory.instance();
    ShapeFactory circle = CircleFactory.instance();

    Shape p1 = point.newShape(); // ?rename? p2 = point.makeShape(withSpec)
    Shape c1 = circle.newShape();

    // Instantiate plane with shapes specified by varargs
    Plane layer = new Plane(p1, c1);

    layer.show();

    layer.add(point.newShape());
    layer.add(circle.newShape());

    layer.show();

  }
}
