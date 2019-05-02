package org.raccoons.backyards;

public final class Stroke {
  private final Paint color;
  private final double width;
  private final StrokeLineCap lineCap;
  //private StrokeDashArray dashArray;


  @Override
  public String toString() {
    return "Stroke{" +
                   "color=" + color +
                   ", width=" + width +
                   '}';
  }

  public Stroke withColor(Paint newcolor) {
    return new Stroke(newcolor, this.width, this.lineCap);
  }

  public Stroke withWidth(double newwidth) {
    return new Stroke(this.color, newwidth, this.lineCap);
  }

  public Stroke withLineCap(StrokeLineCap newlinecap) {
    return new Stroke(this.color, this.width, newlinecap);
  }

  Stroke() {
    this(new Color(), 0.0, StrokeLineCap.BUTT);
  }

  private Stroke(Paint c, double w, StrokeLineCap lc) {
    this.color = c;
    this.width = w;
    this.lineCap = lc;
  }
}
