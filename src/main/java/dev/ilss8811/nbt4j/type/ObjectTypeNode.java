package dev.ilss8811.nbt4j.type;

public class ObjectTypeNode implements TypeNode<Object> {

  private final Byte id;

  private final String name;

  private final Object value;

  public ObjectTypeNode(Byte id, String name, Object value) {
    this.id = id;
    this.name = name;
    this.value = value;
  }

  @Override
  public Byte getId() {
    return this.id;
  }

  @Override
  public String getName() {
    return this.name;
  }

  @Override
  public Object getValue() {
    return this.value;
  }

}
