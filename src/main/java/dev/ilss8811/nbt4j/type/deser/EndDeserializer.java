package dev.ilss8811.nbt4j.type.deser;

import dev.ilss8811.nbt4j.type.EndType;
import dev.ilss8811.nbt4j.type.TagType;
import java.io.DataInputStream;
import java.io.IOException;

public class EndDeserializer implements TypeDeserializer<EndType, DataInputStream> {

  @Override
  public EndType deserialize(DataInputStream value) throws IOException {
    return new EndType();
  }

}
