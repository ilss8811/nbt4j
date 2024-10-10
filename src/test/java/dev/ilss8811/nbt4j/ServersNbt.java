package dev.ilss8811.nbt4j;

import dev.ilss8811.nbt4j.annotation.Tag;
import dev.ilss8811.nbt4j.type.TagType;
import java.util.List;

@Tag(type = TagType.COMPOUND)
public class ServersNbt {

  @Tag(type = TagType.LIST, name = "servers")
  private List<Server> servers;

  @Tag(type = TagType.COMPOUND)
  public static class Server {

    @Tag(type = TagType.BYTE, name = "acceptTextures")
    private Byte acceptTextures;

    @Tag(type = TagType.STRING, name = "icon")
    private String icon;

    @Tag(type = TagType.STRING, name = "ip")
    private String ip;

    @Tag(type = TagType.STRING, name = "name")
    private String name;

  }

}
