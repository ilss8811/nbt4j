package dev.ilss8811.nbt4j.type.deser;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.List;

public class IntArrayDeserializer implements
    TypeDeserializer<List<Integer>, DataInputStream> {

  @Override
  public List<Integer> deserialize(DataInputStream value) throws IOException {
    return List.of();
  }

}
