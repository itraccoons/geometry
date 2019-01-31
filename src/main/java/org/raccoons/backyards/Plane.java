package org.raccoons.backyards;

import java.util.Objects;

public class Plane {
  String name;

  @Override
  public String toString() {
    return "Plane{" +
                   "name='" + name + '\'' +
                   '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Plane plane = (Plane) o;
    return Objects.equals(name, plane.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  Plane () {
    this("noname");
  }

  Plane(String name) {
    this.name = name;
  }
}
