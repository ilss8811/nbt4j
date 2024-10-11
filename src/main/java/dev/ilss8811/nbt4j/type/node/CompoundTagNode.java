package dev.ilss8811.nbt4j.type.node;

import dev.ilss8811.nbt4j.type.TagType;

public class CompoundTagNode<T> implements NamedTagNode, ValuedTagNode<T> {

  private final String name;

  private final T value;

  public CompoundTagNode(String name, T value) {
    this.name = name;
    this.value = value;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public T getValue() {
    return this.value;
  }

  @Override
  public byte getId() {
    return TagType.COMPOUND.getId();
  }
}
