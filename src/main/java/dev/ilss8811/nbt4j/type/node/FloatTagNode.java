package dev.ilss8811.nbt4j.type.node;

import dev.ilss8811.nbt4j.type.TagType;

public class FloatTagNode implements NamedTagNode, ValuedTagNode<Float> {

  private final String name;

  private final float value;

  public FloatTagNode(String name, float value) {
    this.name = name;
    this.value = value;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public Float getValue() {
    return this.value;
  }

  @Override
  public byte getId() {
    return TagType.FLOAT.getId();
  }
}
