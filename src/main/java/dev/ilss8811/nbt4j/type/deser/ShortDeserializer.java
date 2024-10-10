package dev.ilss8811.nbt4j.type.deser;

import dev.ilss8811.nbt4j.type.TagType;
import java.io.DataInputStream;
import java.io.IOException;

public class ShortDeserializer implements
    TypeDeserializer<Short, DataInputStream> {

  @Override
  public Short deserialize(DataInputStream value) throws IOException {
    return value.readShort();
  }

}
