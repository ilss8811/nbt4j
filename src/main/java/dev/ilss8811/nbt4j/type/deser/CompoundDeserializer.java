package dev.ilss8811.nbt4j.type.deser;

import dev.ilss8811.nbt4j.type.DeserializerRegistry;
import dev.ilss8811.nbt4j.type.ListObjectTypeNode;
import dev.ilss8811.nbt4j.type.ObjectTypeNode;
import dev.ilss8811.nbt4j.type.TagType;
import dev.ilss8811.nbt4j.type.TypeNode;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class CompoundDeserializer<T> implements
    TypeDeserializer<T, DataInputStream> {

  private final DeserializerRegistry registry = DeserializerRegistry.getInstance();

  private final Class<T> type;

  public CompoundDeserializer(Class<T> type) {
    this.type = type;
  }

  @Override
  public T deserialize(DataInputStream value) throws IOException {
    byte tagId = value.readByte();
    String name = value.readUTF();
    Object typeNode = readTypeNode(value);
    ObjectTypeNode objectTypeNode = new ObjectTypeNode(tagId, name, typeNode);
    return null;
  }

  private TypeNode<?> readTypeNode(DataInputStream value) throws IOException {
    byte tagId = value.readByte();
    String name;
    Object payload;
    if(tagId == TagType.LIST.getId()) {
      name = null;
      byte listTypeId = value.readByte();
      int listSize = value.readInt();
      List<Object> typeNodes = new ArrayList<>();
      for(int i = 0; i < listSize; i++) {
        TypeDeserializer<?, DataInputStream> deserializer = (TypeDeserializer<?, DataInputStream>) registry.getDeserializer(listTypeId);
        if(listTypeId == TagType.COMPOUND.getId()) {
          typeNodes.add(readTypeNode(value));
        } else {
          typeNodes.add(deserializer.deserialize(value));
        }
      }
      payload = typeNodes;
    } else if(tagId == TagType.COMPOUND.getId()) {
      name = value.readUTF();
      payload = readTypeNode(value);
    } else {
      name = value.readUTF();
      TypeDeserializer<?, DataInputStream> deserializer = (TypeDeserializer<?, DataInputStream>) registry.getDeserializer(tagId);
      payload = new ObjectTypeNode(tagId, name, deserializer.deserialize(value));
    }
    return new ObjectTypeNode(tagId, name, payload);
  }

}
