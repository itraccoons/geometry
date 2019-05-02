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

  public Transformation withRotation(double newrotation) {
    return new Transformation(newrotation, this.scale);
  }

  public Transformation withScale(double newscale) {
    return new Transformation(this.rotation, newscale);
  }

  Transformation() {
    this(0.0,0.0);
  }

  private Transformation(double r, double s) {
    this.rotation = r;
    this.scale = s;
  }
}
