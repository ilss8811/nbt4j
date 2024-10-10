package dev.ilss8811.nbt4j.type.deser;

import dev.ilss8811.nbt4j.type.TagType;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class ByteDeserializer implements TypeDeserializer<Byte, DataInputStream> {

  @Override
  public Byte deserialize(DataInputStream value) throws IOException {
    return value.readByte();
  }

}
