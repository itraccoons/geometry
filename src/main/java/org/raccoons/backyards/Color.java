package org.raccoons.backyards;

public final class Color extends Paint {
  private final int red;
  private final int green;
  private final int blue;

  public final static Color BLACK = new Color(0x000000);
  public final static Color BLUE = new Color(0x0000FF);
  public final static Color CYAN = new Color(0x00FFFF);
  public final static Color GREEN = new Color(0x008000);
  public final static Color GRAY = new Color(0x808080);
  public final static Color GREY = new Color(0x808080);
  public final static Color LIME = new Color(0x00FF00);
  public final static Color MAGENTA = new Color(0xFF00FF);
  public final static Color NAVY = new Color(0x000080);
  public final static Color OLIVE = new Color(0x808000);
  public final static Color RED = new Color(0xFF0000);
  public final static Color WHITE = new Color(0xFFFFFF);
  public final static Color YELLOW = new Color(0xFFFF00);


  @Override
  public String toString() {
    return "Color{" +
                   "red=" + red +
                   ", green=" + green +
                   ", blue=" + blue +
                   '}';
  }

  public Color withRed(int newred) {
    return new Color(newred, this.green, this.blue);
  }

  public Color withGreen(int newgreen) {
    return new Color(this.red, newgreen, this.blue);
  }

  public Color withBlue(int newblue) {
    return new Color(this.red, this.green, newblue);
  }

  Color() {
    this(0, 0, 0);
  }

  private Color(int r, int g, int b) {
    this.red = r;
    this.green = g;
    this.blue = b;
  }

  private Color(int hexcolor) {
    this((hexcolor & 0xFF0000) >> 16, (hexcolor & 0xFF00) >> 8, hexcolor & 0xFF);
  }
}
