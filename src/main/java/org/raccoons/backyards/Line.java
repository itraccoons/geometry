package org.raccoons.backyards;

public class Line extends Shape {
  private final Point start;
  private final Point end;

  @Override
  public String toString() {
    return super.toString() +
                   "Line{" +
                   "start=" + start +
                   ", end=" + end +
                   '}';
  }

  public Line withStart(Point newstart) {
    return new Line(newstart, this.end);
  }

  public Line withEnd(Point newend) {
    return new Line(this.start, newend);
  }

  Line() {
    this(new Point(), new Point());
  }

  private Line(Point s, Point e) {
    this.start = s;
    this.end = e;
  }
}
