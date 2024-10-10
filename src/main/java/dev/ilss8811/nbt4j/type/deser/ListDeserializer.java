package dev.ilss8811.nbt4j.type.deser;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.List;

public class ListDeserializer<T> implements
    TypeDeserializer<List<T>, DataInputStream> {

  @Override
  public List<T> deserialize(DataInputStream value) {
    return List.of();
  }

}
