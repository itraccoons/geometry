package org.raccoons.backyards;

public class Point extends Shape {
  private final Plane plane;
  private final Coordinates coordinates;

  @Override
  public String toString() {
    return "Point{" +
                   "plane=" + plane +
                   ", coordinates=" + coordinates +
                   '}';
  }

  public Plane plane() {
    return plane;
  }

  public Coordinates coordinates() {
    return coordinates;
  }

  public Point() {
    this(new Plane(), new Coordinates());
  }

  public Point(Plane plane, Coordinates coordinates) {
    this.plane = plane;
    this.coordinates = coordinates;
  }
}
