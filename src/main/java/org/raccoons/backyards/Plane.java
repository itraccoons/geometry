package org.raccoons.backyards;

import java.util.ArrayList;
import java.util.List;

public class Plane {

  private final List<Shape> shapes = new ArrayList<Shape>();

  public void add(Shape shape) {
    this.shapes.add(shape);
  }

  public void show(){
    for(Shape shape : this.shapes) {
      System.out.println(shape);
    }
  }

  Plane() {
    //this.shapes = new ArrayList<Shape>();
  }

  Plane(Shape... shapes) {
    for(Shape shape : shapes) {
      this.shapes.add(shape);
    }
  }


}
