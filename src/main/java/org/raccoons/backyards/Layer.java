package org.raccoons.backyards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Layer implements Iterable<Element>{
  private final int layerId;
  private String layerName;
  private final Style layerStyle;
  private final List<Element> elements = new ArrayList<Element>();


  public void setLayerName(String name) {
    this.layerName = name;
  }

  public String layerName() {
    return layerName;
  }

  public Style layerStyle() {
    return layerStyle;
  }

  public boolean add(Element e) {
    e.elementStyle().copyFrom(layerStyle);
    return elements.add(e);
  }

  public boolean remove(Element e) {
    return elements.remove(e);
  }

  /*
  public boolean addAll(Shape... ss) {
    boolean result = false;
    for(Shape s : ss) {
      result = this.shapes.add(s);
    }
    return result;
  }
  public boolean addAll(Collection <? extends Shape> c) {
    return true;
  }
  */
  public void draw(){
    System.out.print(layerName + ": ");
    for (Element e : this) {
      e.draw();
    }
    System.out.println();
  }

  @Override
  public Iterator<Element> iterator() {
    return elements.iterator();
  }

  Layer(String name) {
    this.layerId = 1;
    this.layerName = name;
    this.layerStyle = new Style();
  }
}
