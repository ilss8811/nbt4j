package dev.ilss8811.nbt4j.type.node;

import dev.ilss8811.nbt4j.type.TagType;
import java.util.ArrayList;
import java.util.List;

public class IntArrayTagNode implements NamedTagNode, ValuedTagNode<List<Integer>> {

  private final String name;

  private final int[] value;

  public IntArrayTagNode(String name, int[] value) {
    this.name = name;
    this.value = value;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public List<Integer> getValue() {
    List<Integer> integerArray = new ArrayList<>();
    for(int i : this.value) {
      integerArray.add(i);
    }
    return integerArray;
  }

  @Override
  public byte getId() {
    return TagType.INT_ARRAY.getId();
  }
}
