package org.raccoons.backyards;

public class Element {
  private final int elementId;
  private final Style elementStyle;
  private double rotation;

  public int elementId() {
    return elementId;
  }

  public Style elementStyle() {
    return elementStyle;
  }

  public void draw() {
    System.out.print(this);
  }

  @Override
  public String toString() {
    return "Element{" +
                   "elementId=" + elementId +
                   ", elementStyle=" + elementStyle +
                   ", rotation=" + rotation +
                   '}';
  }

  Element() {
    this.elementStyle = new Style();
    this.elementId = 1;
    this.rotation = 0.0;
  }

}
