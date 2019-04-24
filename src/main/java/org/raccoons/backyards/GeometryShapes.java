package org.raccoons.backyards;

public class GeometryShapes {

  public static void main(String[] args) {

    MultiLayeredImage image = new MultiLayeredImage(
            new Layer(),
            new Layer().withName("Layer2")
    );

    Layer layer3 =
            new Layer()
                    .withName("Layer3")
                    .withStyle(new Style().withOptacity(0.5));

    Node nodeTemplate =
            new Node()
                    .withStyle(new Style().withOptacity(0.75))
                    .withTransformation(new Transformation());

    Point point =
            new Point()
                    .withX(1)
                    .withY(21);

    Line line =
            new Line()
                    .withStart(new Point().withX(5).withY(15))
                    .withEnd(new Point().withX(3).withY(33));

    Circle circle =
            new Circle()
                    .withCenter(new Point().withX(44).withY(54))
                    .withRadius(51);

    Rectangle rectangle =
            new Rectangle()
                    .withPosition(point)
                    .withWidth(100)
                    .withHeight(200);

    layer3.add(nodeTemplate.withShape(point));
    layer3.add(nodeTemplate.withShape(line));
    layer3.add(nodeTemplate.withShape(circle));

    Layer layer4 = layer3.clone().withName("LAYER4");

    image.addAll(layer3, layer4);
    image.draw();
    image.removeAll(layer3);
    image.draw();

  }

}
