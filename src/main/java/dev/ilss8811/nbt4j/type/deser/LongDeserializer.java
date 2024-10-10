package dev.ilss8811.nbt4j.type.deser;

import dev.ilss8811.nbt4j.type.TagType;
import java.io.DataInputStream;
import java.io.IOException;

public class LongDeserializer implements
    TypeDeserializer<Long, DataInputStream> {

  @Override
  public Long deserialize(DataInputStream value) throws IOException {
    return value.readLong();
  }

}
