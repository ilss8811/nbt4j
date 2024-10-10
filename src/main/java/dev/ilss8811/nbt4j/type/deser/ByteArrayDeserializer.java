package dev.ilss8811.nbt4j.type.deser;

import dev.ilss8811.nbt4j.type.TagType;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ByteArrayDeserializer implements
    TypeDeserializer<List<Byte>, DataInputStream> {

  @Override
  public List<Byte> deserialize(DataInputStream value) throws IOException {
    List<Byte> byteArray = new ArrayList<>();
    int length = value.readInt();
    byte[] arr = value.readNBytes(length);
    for(int i = 0; i < length; i++) {
      byteArray.add(arr[i]);
    }
    return byteArray;
  }

}
