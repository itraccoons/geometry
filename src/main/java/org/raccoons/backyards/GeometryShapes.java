package org.raccoons.backyards;

import java.util.Set;

public class GeometryShapes {

  public static void main(String[] args) {

    MultiLayeredImage image = new MultiLayeredImage(
            new Layer("Layer1"),
            new Layer("Layer2")
    );

    Layer layer3 = new Layer("Layer3");
    Layer layer4 = new Layer("Layer4");


    image.addAll(layer3, layer4);
    image.add(new Layer("Layer5"));

    Element element1 = new Element();
    Element element2 = new Element();

    layer3.add(element1);
    layer3.add(element2);

    /*
    for (Layer l : image) {

      System.out.println(l.layerName());
    }
    */

    image.draw();
    image.removeAll(layer3,layer4);
    image.draw();

  }

}
