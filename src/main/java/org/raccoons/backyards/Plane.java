package org.raccoons.backyards;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Plane {

  private final List<Shape> shapes = new ArrayList<Shape>();

  public void add(Shape... shapes) {
    for(Shape shape : shapes) {
      this.shapes.add(shape);
    }
  }

  public void show(){
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    JFrame frame = new JFrame();
    frame.setSize(new Dimension(screenSize.width / 2, screenSize.height / 2));

    JTextArea textArea = new JTextArea(20,80);
    textArea.setEditable(false);

    for(Shape shape : this.shapes) {
      textArea.append(shape.toString() + "\n");
    }

    frame.add(new JScrollPane(textArea));
    frame.setVisible(true);
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
