package dev.ilss8811.nbt4j.type.deser;

import java.io.IOException;
import java.io.InputStream;

@FunctionalInterface
public interface TypeDeserializer<T, S extends InputStream> {

  T deserialize(S value) throws IOException;

}
