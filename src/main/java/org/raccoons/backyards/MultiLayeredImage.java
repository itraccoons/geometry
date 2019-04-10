package org.raccoons.backyards;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MultiLayeredImage implements Iterable<Layer> {
  private final List<Layer> imageLayers = new ArrayList<Layer>();

  public boolean add(Layer l){
    return imageLayers.add(l);
  }

  public boolean addAll(Layer... ls) {
    boolean result = false;
    for (Layer l : ls) {
      result = imageLayers.add(l);
    }
    return result;
  }

  public boolean remove(Layer l) {
    return imageLayers.remove(l);
  }

  public boolean removeAll(Layer... ls) {
    boolean result = false;
    for (Layer l : ls) {
      result = imageLayers.remove(l);
    }
    return result;
  }

  public void draw() {
    for (Layer l : this) {
      l.draw();
    }
  }

  @Override
  public Iterator<Layer> iterator() {
    return imageLayers.iterator();
  }

  public MultiLayeredImage() {
  }

  public MultiLayeredImage(Layer... ls) {
    for (Layer l : ls) {
      this.imageLayers.add(l);
    }
  }

}
