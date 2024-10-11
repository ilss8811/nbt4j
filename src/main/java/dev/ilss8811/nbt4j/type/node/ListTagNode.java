package dev.ilss8811.nbt4j.type.node;

import dev.ilss8811.nbt4j.type.TagType;
import java.util.List;

public class ListTagNode<T> implements ValuedTagNode<List<T>> {

  private List<T> value;

  @Override
  public List<T> getValue() {
    return this.value;
  }

  @Override
  public byte getId() {
    return TagType.LIST.getId();
  }

}
