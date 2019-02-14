package org.raccoons.backyards;

public class Triangle extends Shape {
  public final Point verticeA;
  public final Point verticeB;
  public final Point verticeC;


  Triangle(Point verticeA, Point verticeB, Point verticeC) throws IllegalArgumentException {
//    if (isCollinear(verticeA, verticeB, verticeC)) {
//      throw new IllegalArgumentException("Points does not determines triangle");
//    }
    this.verticeA = verticeA;
    this.verticeB = verticeB;
    this.verticeC = verticeC;
  }
/*
  private static boolean isCollinear(Point verticeA, Point verticeB, Point verticeC) {
    if ( verticeA.plane().equals(verticeB.plane()) && verticeB.plane().equals(verticeC.plane()) ) {
      return true;
    }
    return false;
  }
 */

}
