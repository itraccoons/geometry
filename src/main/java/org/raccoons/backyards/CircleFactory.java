package org.raccoons.backyards;

import java.io.Serializable;

public class CircleFactory extends ShapeFactory implements Serializable {

  private static final ShapeFactory INSTANCE = new CircleFactory();

  private CircleFactory(){
  }
  public static ShapeFactory instance() {
    return INSTANCE;
  }

  // Implementing the 'readResolve()' method.
  protected Object readResolve() {
    return instance();
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    throw new CloneNotSupportedException();
  }

  @Override
  public Shape newShape() {
    return new Circle();
  }

}
