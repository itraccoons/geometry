package org.raccoons.backyards;

public class Element {
  private final int elementId;
  private final Style elementStyle;
  private final Shape elementShape;
  private final Transformation elementTransformation;

  @Override
  public String toString() {
    return "Element{" +
                   "elementId=" + elementId +
                   ", elementStyle=" + elementStyle +
                   ", elementShape=" + elementShape +
                   ", elementTransformation=" + elementTransformation +
                   '}';
  }

  public Element withStyle(Style newstyle) {
    return new Element(this.elementId, newstyle, this.elementShape, this.elementTransformation);
  }

  public Element withTransformation(Transformation newtransformation) {
    return new Element(this.elementId, this.elementStyle, this.elementShape,newtransformation);
  }

  Element(Shape shape) {
    this(1, new Style(), shape, new Transformation());
  }

  private Element(int id, Style style, Shape shape, Transformation transformation) {
    this.elementId = id;
    this.elementStyle = style;
    this.elementShape = shape;
    this.elementTransformation = transformation;
  }
}
