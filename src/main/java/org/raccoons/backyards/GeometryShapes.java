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
                    .withStyle(new Style().withOptacity(0.25))
                    .withTransformation(new Transformation().withRotation(0.75).withScale(0.5));

    Shape point =
            new Point()
                    .withX(1)
                    .withY(21);

    Shape line =
            new Line()
                    .withStart(new Point().withX(5).withY(15))
                    .withEnd(new Point().withX(3).withY(33))
                    .withStroke(new Stroke()
                                        .withColor(Color.RED)
                                        .withWidth(5)
                                        .withLineCap(StrokeLineCap.ROUND));

    Shape circle =
            new Circle()
                    .withCenter(new Point().withX(100).withY(100))
                    .withRadius(100)
                    .withFill(new Color().withRed(100).withGreen(100).withBlue(100))
                    .withStroke(new Stroke().withColor(Color.GREEN));

    Shape rectangle =
            new Rectangle()
                    .withPosition(new Point().withX(200).withY(200))
                    //.withPosition(new Point(200, 200))
                    .withWidth(200)
                    .withHeight(200)
                    .withFill(Color.BLACK)
                    .withStroke(new Stroke().withColor(Color.BLUE).withLineCap(StrokeLineCap.ROUND));

    layer3.add(nodeTemplate.withShape(point));
    layer3.add(nodeTemplate.withShape(line));
    layer3.add(nodeTemplate.withShape(circle));
    layer3.add(nodeTemplate.withShape(rectangle));

    Layer layer4 = layer3.clone().withName("LAYER4");

    image.addAll(layer3, layer4);
    image.draw();
    image.removeAll(layer3);
    image.draw();
  }

}
