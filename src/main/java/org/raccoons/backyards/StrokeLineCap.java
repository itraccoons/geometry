package org.raccoons.backyards;

public final class StrokeLineCap {
  private final int strokeLineCap;

  public final static StrokeLineCap BUTT = new StrokeLineCap(0);
  public final static StrokeLineCap ROUND = new StrokeLineCap(1);
  public final static StrokeLineCap SQUARE = new StrokeLineCap(2);

  @Override
  public String toString() {
    return "StrokeLineCap{" +
                   "strokeLineCap=" + strokeLineCap +
                   '}';
  }

  private StrokeLineCap(int slc) {
    this.strokeLineCap = slc;
  }
}
