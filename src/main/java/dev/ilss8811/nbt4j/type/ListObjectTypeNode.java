package dev.ilss8811.nbt4j.type;

import java.util.List;

public class ListObjectTypeNode implements TypeNode<List<TypeNode<Object>>> {

  private final Byte id;

  private final List<TypeNode<Object>> value;

  public ListObjectTypeNode(Byte id, List<TypeNode<Object>> value) {
    this.id = id;
    this.value = value;
  }

  @Override
  public Byte getId() {
    return this.id;
  }

  @Override
  public String getName() {
    return null;
  }

  @Override
  public List<TypeNode<Object>> getValue() {
    return this.value;
  }

}
