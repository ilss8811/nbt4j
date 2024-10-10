package dev.ilss8811.nbt4j.type;

import dev.ilss8811.nbt4j.type.deser.ByteArrayDeserializer;
import dev.ilss8811.nbt4j.type.deser.ByteDeserializer;
import dev.ilss8811.nbt4j.type.deser.DoubleDeserializer;
import dev.ilss8811.nbt4j.type.deser.EndDeserializer;
import dev.ilss8811.nbt4j.type.deser.FloatDeserializer;
import dev.ilss8811.nbt4j.type.deser.IntArrayDeserializer;
import dev.ilss8811.nbt4j.type.deser.IntegerDeserializer;
import dev.ilss8811.nbt4j.type.deser.LongArrayDeserializer;
import dev.ilss8811.nbt4j.type.deser.LongDeserializer;
import dev.ilss8811.nbt4j.type.deser.ShortDeserializer;
import dev.ilss8811.nbt4j.type.deser.TypeDeserializer;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public final class DeserializerRegistry {

  private static final Map<Byte, TypeDeserializer<?, ? extends InputStream>> REGISTRY = new HashMap<>();

  private static DeserializerRegistry INSTANCE;

  private DeserializerRegistry() {}

  static {
    REGISTRY.put(TagType.END.getId(), new EndDeserializer());
    REGISTRY.put(TagType.BYTE.getId(), new ByteDeserializer());
    REGISTRY.put(TagType.SHORT.getId(), new ShortDeserializer());
    REGISTRY.put(TagType.INT.getId(),new IntegerDeserializer());
    REGISTRY.put(TagType.LONG.getId(), new LongDeserializer());
    REGISTRY.put(TagType.FLOAT.getId(), new FloatDeserializer());
    REGISTRY.put(TagType.DOUBLE.getId(), new DoubleDeserializer());
    REGISTRY.put(TagType.BYTE_ARRAY.getId(), new ByteArrayDeserializer());
    REGISTRY.put(TagType.INT_ARRAY.getId(), new IntArrayDeserializer());
    REGISTRY.put(TagType.LONG_ARRAY.getId(), new LongArrayDeserializer());
  }

  public static DeserializerRegistry getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new DeserializerRegistry();
    }
    return INSTANCE;
  }

  public TypeDeserializer<?, ? extends InputStream> getDeserializer(TagType type) {
    return getDeserializer(type.getId());
  }

  public TypeDeserializer<?, ? extends InputStream> getDeserializer(byte typeId) {
    return REGISTRY.get(typeId);
  }

}
