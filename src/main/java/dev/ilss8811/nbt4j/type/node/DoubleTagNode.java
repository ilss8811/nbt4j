package dev.ilss8811.nbt4j.type.node;

import dev.ilss8811.nbt4j.type.TagType;

public class DoubleTagNode implements NamedTagNode, ValuedTagNode<Double> {

  private final String name;

  private final double value;

  public DoubleTagNode(String name, double value) {
    this.name = name;
    this.value = value;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public Double getValue() {
    return this.value;
  }

  @Override
  public byte getId() {
    return TagType.DOUBLE.getId();
  }

}
