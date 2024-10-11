package dev.ilss8811.nbt4j.type.node;

import dev.ilss8811.nbt4j.type.TagType;
import java.util.ArrayList;
import java.util.List;

public class ByteArrayTagNode implements
    ValuedTagNode<List<Byte>>, NamedTagNode {

  private final String name;

  private final byte[] value;

  public ByteArrayTagNode(String name, byte[] value) {
    this.name = name;
    this.value = value;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public List<Byte> getValue() {
    List<Byte> byteArray = new ArrayList<>();
    for(byte b : this.value) {
      byteArray.add(b);
    }
    return byteArray;
  }

  @Override
  public byte getId() {
    return TagType.BYTE_ARRAY.getId();
  }

}
