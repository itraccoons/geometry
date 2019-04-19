package org.raccoons.backyards;

public class Transformation {
  private double rotation;
  private double scale;

  @Override
  public String toString() {
    return "Transformation{" +
                   "rotation=" + rotation +
                   ", scale=" + scale +
                   '}';
  }

  Transformation() {
    this.rotation = 0.0;
    this.scale  = 0.0;
  }
}
