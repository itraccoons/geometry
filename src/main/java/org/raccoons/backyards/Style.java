package org.raccoons.backyards;

public final class Style {
  private final boolean visible;
  private final double optacity;

  @Override
  public String toString() {
    return "Style{" +
                   "visible=" + visible +
                   ", optacity=" + optacity +
                   '}';
  }

  /*
   * Chained setters
   */
  public Style withVisible(boolean v) {
    return new Style(v, this.optacity);
  }

  public Style withOptacity(double o) {
    return new Style(this.visible, o);
  }

  /*
   * Constructors
   */
  Style() {
    this(true, 1.0);
  }

  private Style(boolean v, double o) {
    this.visible = v;
    this.optacity = o;
  }
}
