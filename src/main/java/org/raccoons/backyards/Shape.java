package org.raccoons.backyards;

public class Shape {
  private final Paint fill;
  //private final Stroke stroke;

  @Override
  public String toString() {
    return "Shape{" +
                   "fill=" + fill +
                   '}';
  }

  Shape() {
      this.fill = new Color();
    }
}
