package dev.ilss8811.nbt4j.type.node;

import dev.ilss8811.nbt4j.type.TagType;

public class EndTagNode implements TagNode {

  @Override
  public byte getId() {
    return TagType.END.getId();
  }

}
