package org.raccoons.backyards;

public class Point extends Shape {
  private final PolarCoordinates coordinates;

  @Override
  public String toString() {
    return "Point{" +
                   "coordinates=" + coordinates +
                   '}';
  }

  public Point() {
    this(new PolarCoordinates());
  }

  public Point(PolarCoordinates coordinates) {
    this.coordinates = coordinates;
  }
}
