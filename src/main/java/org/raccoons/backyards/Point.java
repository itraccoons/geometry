package org.raccoons.backyards;

public class Point extends Shape {
  private final PolarCoordinate coordinate;

  @Override
  public String toString() {
    return "Point{" +
                   "coordinate=" + coordinate +
                   '}';
  }

  public Point() {
    this(new PolarCoordinate());
  }

  public Point(PolarCoordinate coordinate) {
    this.coordinate = coordinate;
  }
}
