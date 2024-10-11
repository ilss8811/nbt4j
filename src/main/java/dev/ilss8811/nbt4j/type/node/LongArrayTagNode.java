package dev.ilss8811.nbt4j.type.node;

import dev.ilss8811.nbt4j.type.TagType;
import java.util.ArrayList;
import java.util.List;

public class LongArrayTagNode implements NamedTagNode, ValuedTagNode<List<Long>> {

  private final String name;

  private final long[] value;

  public LongArrayTagNode(String name, long[] value) {
    this.name = name;
    this.value = value;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public List<Long> getValue() {
    List<Long> longArray = new ArrayList<>();
    for(long l : this.value) {
      longArray.add(l);
    }
    return longArray;
  }

  @Override
  public byte getId() {
    return TagType.LONG_ARRAY.getId();
  }
}
