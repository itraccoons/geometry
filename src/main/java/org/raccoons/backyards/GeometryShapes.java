package org.raccoons.backyards;

public class GeometryShapes {

  public static void main(String[] args) {

    /*
     *  Version of factory: overridden factory methods.
     *  Need to define way of args passing for different families of products
     */

    ShapeFactory pointFactory = PointFactory.instance();
    ShapeFactory circleFactory = CircleFactory.instance();


    // Instantiate plane with shapes specified by varargs
    Plane foreground = new Plane(pointFactory.newShape(), pointFactory.newShape());

    Shape point = pointFactory.newShape();
    Shape circle = circleFactory.newShape();

    foreground.show();

    foreground.add(point);
    foreground.add(circle);
    foreground.show();


    /*
     * Another version of factory: multiple factory methods
     */
    Surface2DFactory surface2D = Surface2DFactory.instance();

    Shape dot = surface2D.newPoint(
            surface2D.newPolarCoordinate(10,20)
    );

    Point wheelCenter = (Point) dot;
    Shape wheel = surface2D.newCircle(wheelCenter, 30);

    Plane background = surface2D.newPlane();

    background.add(wheel);
    background.add(dot, wheel);
    background.show();
  }
}
