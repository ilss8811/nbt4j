package dev.ilss8811.nbt4j.type.deser;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.List;

public class LongArrayDeserializer implements
    TypeDeserializer<List<Long>, DataInputStream> {

  @Override
  public List<Long> deserialize(DataInputStream value) throws IOException {
    return List.of();
  }

}
