package org.raccoons.backyards;

public final class Line extends Shape {
  private final Point start;
  private final Point end;
  private final Stroke stroke;

  @Override
  public String toString() {
    return "Line{" +
                   "start=" + start +
                   ", end=" + end +
                   ", stroke=" + stroke +
                   '}';
  }

  public Line withStart(Point newstart) {
    return new Line(newstart, this.end, this.stroke);
  }

  public Line withEnd(Point newend) {
    return new Line(this.start, newend, this.stroke);
  }

  public Line withStroke(Stroke newstroke) {
    return new Line(this.start, this.end, newstroke);
  }

  Line() {
    this(new Point(), new Point(), new Stroke());
  }

  private Line(Point start, Point end, Stroke stroke) {
    this.start = start;
    this.end = end;
    this.stroke = stroke;

  }
}
