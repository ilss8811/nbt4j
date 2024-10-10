package dev.ilss8811.nbt4j.type;

import java.util.List;

public interface TypeNode<T> {

  Byte getId();

  String getName();

  T getValue();

}
