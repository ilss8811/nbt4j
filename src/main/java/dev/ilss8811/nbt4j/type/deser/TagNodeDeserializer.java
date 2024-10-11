package dev.ilss8811.nbt4j.type.deser;

import dev.ilss8811.nbt4j.type.node.TagNode;
import java.io.InputStream;

public interface TagNodeDeserializer<T extends TagNode, S extends InputStream> {

  T deserialize(S inputStream);

}
