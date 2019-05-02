package org.raccoons.backyards;

public class Stroke {
  private final Paint color;
  private final double width;
  //private StrokeLineCap lineCap;
  //private StrokeDashArray dashArray;


  @Override
  public String toString() {
    return "Stroke{" +
                   "color=" + color +
                   ", width=" + width +
                   '}';
  }

  public Stroke withColor(Paint newcolor) {
    return new Stroke(newcolor, this.width);
  }

  public Stroke withWidth(double newwidth) {
    return new Stroke(this.color, newwidth);
  }

  Stroke() {
    this(new Color(), 0.0);
  }

  private Stroke(Paint c, double w) {
    this.color = c;
    this.width = w;
  }
}
