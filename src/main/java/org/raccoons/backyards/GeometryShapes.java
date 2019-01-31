package org.raccoons.backyards;

public class GeometryShapes {

  public static void main(String[] args) {

    Shape point1 = new Point(
            new Plane("plane1"),
            new Coordinates(45, 100)
    );

    Shape circle = new Circle((Point) point1, 10);
    System.out.println(circle);


    Shape point2 = new Point(
            new Plane("plane2"),
            new Coordinates(45, 100)
    );

    Shape point3 = point1;

    System.out.println(point1);
    System.out.println(point2);
    System.out.println(point3);


    Shape triangle = new Triangle((Point)point1,(Point)point2,(Point)point3);
    System.out.println(triangle);
  }
}
