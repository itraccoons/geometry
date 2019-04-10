package org.raccoons.backyards;

public class Style {
  private boolean visible;
  private double optacity;

  public void setVisible(boolean value) {
    this.visible = value;
  }

  public void setOptacity(double value) {
    this.optacity = value;
  }

  public boolean visible() {
    return visible;
  }

  public double optacity() {
    return optacity;
  }

  public void copyFrom(Style s) {
    visible = s.visible();
    optacity = s.optacity();
  }

  @Override
  public String toString() {
    return "Style{" +
                   "visible=" + visible +
                   ", optacity=" + optacity +
                   '}';
  }

  Style() {
    this.visible = true;
    this.optacity = 1.0;

  }
}
