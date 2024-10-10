package dev.ilss8811.nbt4j.annotation;

import dev.ilss8811.nbt4j.type.TagType;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
public @interface Tag {

  TagType type();

  String name() default "";

}
