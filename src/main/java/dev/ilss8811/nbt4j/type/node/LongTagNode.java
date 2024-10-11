package dev.ilss8811.nbt4j.type.node;

import dev.ilss8811.nbt4j.type.TagType;

public class LongTagNode implements NamedTagNode, ValuedTagNode<Long> {

  private final String name;

  private final long value;

  public LongTagNode(String name, long value) {
    this.name = name;
    this.value = value;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public Long getValue() {
    return this.value;
  }

  @Override
  public byte getId() {
    return TagType.LONG.getId();
  }

}
