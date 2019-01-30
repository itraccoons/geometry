package org.raccoons.backyards;

public class GeometryShapes {

  public static void main(String[] args) {
    Shape factoryPoint = new Point();
    Shape factoryCircle = new Circle();

    Shape point = factoryPoint.newInstance();
    Shape circle = factoryCircle.newInstance();

    System.out.println(point);
    System.out.println(circle);
  }
}
