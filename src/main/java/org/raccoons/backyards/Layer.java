package org.raccoons.backyards;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class Layer implements Iterable<Element>{
  private final int layerId;
  private final String layerName;
  private final Style layerStyle;
  private final List<Element> layerElements;

  public boolean add(Element e) {
    return layerElements.add(e.withStyle(layerStyle));
  }

  public boolean remove(Element e) {
    return layerElements.remove(e);
  }

  public void draw(){
    System.out.println(layerName + ": ");
    for (Element e : this) {
      System.out.println(e);
    }
  }

  @Override
  public Iterator<Element> iterator() {
    return layerElements.iterator();
  }

  public Layer withName(String newname) {
    return new Layer(this.layerId, newname, this.layerStyle, this.layerElements);
  }

  public Layer withStyle(Style newstyle) {
    return new Layer(this.layerId, this.layerName, newstyle, this.layerElements);
  }

  Layer() {
    this(1, "NONAME", new Style(), new ArrayList<Element>());
  }

  private Layer(int id, String name, Style style, List<Element> elements) {
    this.layerId = id;
    this.layerName = name;
    this.layerStyle = style;
    this.layerElements = elements;
  }
}
