package org.raccoons.backyards;

public class Node {
  private final int nodeId;
  private final Shape nodeShape;
  private final Style nodeStyle;
  private final Transformation nodeTransformation;

  @Override
  public String toString() {
    return "Node{" +
                   "nodeId=" + nodeId +
                   ", nodeShape=" + nodeShape +
                   ", nodeStyle=" + nodeStyle +
                   ", nodeTransformation=" + nodeTransformation +
                   '}';
  }

  public Node withStyle(Style newstyle) {
    return new Node(this.nodeId, newstyle, this.nodeShape, this.nodeTransformation);
  }

  public Node withTransformation(Transformation newtransformation) {
    return new Node(this.nodeId, this.nodeStyle, this.nodeShape, newtransformation);
  }

  public Node withShape(Shape newshape) {
    return new Node(this.nodeId, this.nodeStyle, newshape, this.nodeTransformation);
  }

  Node() {
    this(1, new Style(), new Shape(), new Transformation());
  }

  private Node(int id, Style style, Shape shape, Transformation transformation) {
    this.nodeId = id;
    this.nodeStyle = style;
    this.nodeShape = shape;
    this.nodeTransformation = transformation;
  }
}
