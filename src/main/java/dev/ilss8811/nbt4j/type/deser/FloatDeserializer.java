package dev.ilss8811.nbt4j.type.deser;

import dev.ilss8811.nbt4j.type.TagType;
import java.io.DataInputStream;
import java.io.IOException;

public class FloatDeserializer implements
    TypeDeserializer<Float, DataInputStream> {

  @Override
  public Float deserialize(DataInputStream value) throws IOException {
    return value.readFloat();
  }

}
