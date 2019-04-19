package org.raccoons.backyards;

public class GeometryShapes {

  public static void main(String[] args) {

    MultiLayeredImage image = new MultiLayeredImage(
            new Layer(),
            new Layer().withName("Layer2")
    );

    Layer layer3 = new Layer()
                           .withName("Layer3")
                           .withStyle(new Style().withOptacity(0.5));

    Layer layer4 = new Layer().withName("Layer4");

    image.addAll(layer3, layer4);
    image.add(new Layer());

    Element element2 = new Element(new Line(new PolarCoordinate(), new PolarCoordinate()));

    layer3.add(element2);
    layer4.add(element2);

    image.draw();
    image.removeAll(layer3);
    image.draw();

  }

}
