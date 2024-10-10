package dev.ilss8811.nbt4j.type.deser;

import java.io.DataInputStream;
import java.io.IOException;

public class StringDeserializer implements TypeDeserializer<String, DataInputStream> {

  @Override
  public String deserialize(DataInputStream value) throws IOException {
    return value.readUTF();
  }

}
