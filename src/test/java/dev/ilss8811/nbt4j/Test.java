package dev.ilss8811.nbt4j;

import dev.ilss8811.nbt4j.ServersNbt.Server;
import dev.ilss8811.nbt4j.type.deser.CompoundDeserializer;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {

  public static void main(String[] args) throws IOException {
    CompoundDeserializer<ServersNbt> deserializer = new CompoundDeserializer<>(ServersNbt.class);
    File file = new File("src/main/resources/sample.nbt");
    DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
    ServersNbt serversNbt = deserializer.deserialize(dataInputStream);
    System.out.println("1");
  }

}
