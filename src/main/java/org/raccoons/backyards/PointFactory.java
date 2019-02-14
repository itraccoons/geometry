package org.raccoons.backyards;

import java.io.Serializable;

public class PointFactory extends ShapeFactory implements Serializable {
  //private static final PointFactory INSTANCE = new PointFactory();
  private static PointFactory INSTANCE = null;

  private PointFactory(){
  }

  public static ShapeFactory instance() {
    if( INSTANCE == null ){
      INSTANCE = new PointFactory();
    }
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
    return new Point();
  }

}
