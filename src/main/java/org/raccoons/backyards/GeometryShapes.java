package org.raccoons.backyards;

public class GeometryShapes {

  public static void main(String[] args) {

    /*
     *  Version of factory: overloaded factory methods.
     *
     */

    ShapeFactory point = PointFactory.instance();
    ShapeFactory circle = CircleFactory.instance();

    Shape p1 = point.newShape();
    // p11 = point.newShape(shapeSpec)
    Shape c1 = circle.newShape();

    // Instantiate plane with shapes specified by varargs
    Plane layer = new Plane(p1, c1);

    layer.show();
    layer.add(point.newShape());
    layer.add(circle.newShape());
    layer.show();


    /*
     * Another version of factory: multiple factory methods
     */
    ShapeFactory2 factory = ShapeFactory2.instance();

    Shape p2 = factory.newPoint();
    Shape p22 = factory.newPoint(new PolarCoordinates(10,20));

    Shape c2 = factory.newCircle();
    Shape c22 = factory.newCircle((Point) p22, 30);

    layer.add(p2, c2, p22, c22);
    layer.show();
  }
}
