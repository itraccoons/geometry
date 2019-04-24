package org.raccoons.backyards;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class Layer implements Iterable<Node>{
  private final int layerId;
  private final String layerName;
  private final Style layerStyle;
  private final List<Node> layerNodes;

  public boolean add(Node e) {
//    return layerNodes.add(e.withStyle(layerStyle));
    return layerNodes.add(e);
  }

  public boolean remove(Node e) {
    return layerNodes.remove(e);
  }

  public void draw(){
    System.out.println(layerName + ": ");
    for (Node e : this) {
      System.out.println(e);
    }
  }

  @Override
  public Iterator<Node> iterator() {
    return layerNodes.iterator();
  }

  public Layer withName(String newname) {
    return new Layer(this.layerId, newname, this.layerStyle, this.layerNodes);
  }

  public Layer withStyle(Style newstyle) {
    return new Layer(this.layerId, this.layerName, newstyle, this.layerNodes);
  }

  public Layer clone() {
    return new Layer(this.layerId, this.layerName, this.layerStyle, this.layerNodes);
  }

  Layer() {
    this(1, "NONAME", new Style(), new ArrayList<Node>());
  }

  private Layer(int id, String name, Style style, List<Node> nodes) {
    this.layerId = id;
    this.layerName = name;
    this.layerStyle = style;
    this.layerNodes = nodes;
  }
}
