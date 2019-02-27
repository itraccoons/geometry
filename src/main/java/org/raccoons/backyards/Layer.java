package org.raccoons.backyards;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Layer {

  private final List<Shape> shapes = new ArrayList<Shape>();

  public boolean add(Shape s) {
    return this.shapes.add(s);
  }

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

  public void show(){
    for(Shape shape : this.shapes) {
      System.out.println(shape);
      if(shape.isVisible()) {
        System.out.println("isVisible");
      }
    }

  }

  Layer() {
    //this.shapes = new ArrayList<Shape>();
  }
}
