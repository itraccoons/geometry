package org.raccoons.backyards;

import javafx.scene.paint.Paint;

import javax.accessibility.AccessibleState;
import javax.accessibility.AccessibleStateSet;

public abstract class Shape {
  private final AccessibleStateSet accessibleStateSet = new AccessibleStateSet();

  public final void setVisible(boolean b) {
    if(b) {
      accessibleStateSet.add(AccessibleState.VISIBLE);
    }else{
      accessibleStateSet.remove(AccessibleState.VISIBLE);
    }
  }

  public final boolean isVisible() {
    return accessibleStateSet.contains(AccessibleState.VISIBLE);
  }

  public final void setFill(Paint value) {

  }

  public void relocate(PolarCoordinate pc) {

  }

  public void setRotate(double value) {
  }

  public final String type() {
    return getClass().getSimpleName();
  }
}
