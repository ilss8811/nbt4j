package dev.ilss8811.nbt4j.type.deser;

import dev.ilss8811.nbt4j.type.TagType;
import java.io.DataInputStream;
import java.io.IOException;

public class IntegerDeserializer implements
    TypeDeserializer<Integer, DataInputStream> {

  @Override
  public Integer deserialize(DataInputStream value) throws IOException {
    return value.readInt();
  }
  
}
