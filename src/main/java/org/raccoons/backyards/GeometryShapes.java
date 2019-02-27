package org.raccoons.backyards;

public class GeometryShapes {

  public static void main(String[] args) {

    Line line = new Line(new CartesianCoordinate(10,10), new CartesianCoordinate(100,10));

    Circle circle = new Circle(new CartesianCoordinate(-20,-20),  100);

    Rectangle rectangle = new Rectangle(50, 50, new CartesianCoordinate(-50, -50));

    Layer plane = new Layer();

    plane.addAll(line, circle, rectangle);
    plane.show();
  }

}
