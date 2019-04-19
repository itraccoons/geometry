package org.raccoons.backyards;

public class Line extends Shape {
  private Coordinate start;
  private Coordinate end;

  public void setStart(Coordinate s) {
    this.start = s;
  }

  public void setEnd(Coordinate e) {
    this.end = e;
  }

  public Coordinate start() {
    return start;
  }

  public Coordinate end() {
    return end;
  }

  @Override
  public String toString() {
    return super.toString() +
                   "Line{" +
                   "start=" + start +
                   ", end=" + end +
                   '}';
  }

  Line(Coordinate s, Coordinate e) {
    this.start = s;
    this.end = e;
  }

  //Line(Coordinate start, Coordinate end, Style style) {}

}
