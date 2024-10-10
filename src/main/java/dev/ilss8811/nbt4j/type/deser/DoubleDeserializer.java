package dev.ilss8811.nbt4j.type.deser;

import dev.ilss8811.nbt4j.type.TagType;
import java.io.DataInputStream;
import java.io.IOException;

public class DoubleDeserializer implements
    TypeDeserializer<Double, DataInputStream> {

  @Override
  public Double deserialize(DataInputStream value) throws IOException {
    return value.readDouble();
  }

}
