package dev.ilss8811.nbt4j.type.node;

import dev.ilss8811.nbt4j.type.TagType;

public class ShortTagNode implements NamedTagNode, ValuedTagNode<Short> {

  private final String name;

  private final short value;

  public ShortTagNode(String name, short value) {
    this.name = name;
    this.value = value;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public Short getValue() {
    return this.value;
  }

  @Override
  public byte getId() {
    return TagType.SHORT.getId();
  }

}
