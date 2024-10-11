package dev.ilss8811.nbt4j.type.node;

import dev.ilss8811.nbt4j.type.TagType;

public class IntTagNode implements NamedTagNode, ValuedTagNode<Integer> {

  private final String name;

  private final Integer value;

  public IntTagNode(String name, Integer value) {
    this.name = name;
    this.value = value;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public Integer getValue() {
    return this.value;
  }

  @Override
  public byte getId() {
    return TagType.INT.getId();
  }
}
