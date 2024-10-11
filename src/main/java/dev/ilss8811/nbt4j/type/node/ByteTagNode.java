package dev.ilss8811.nbt4j.type.node;

import dev.ilss8811.nbt4j.type.TagType;

public class ByteTagNode implements NamedTagNode, ValuedTagNode<Byte> {

  private final String name;

  private final byte value;

  public ByteTagNode(String name, byte value) {
    this.name = name;
    this.value = value;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public byte getId() {
    return TagType.BYTE.getId();
  }

  @Override
  public Byte getValue() {
    return this.value;
  }

}
