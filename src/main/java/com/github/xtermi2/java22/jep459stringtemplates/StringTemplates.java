package com.github.xtermi2.java22.jep459stringtemplates;

public class StringTemplates {
    private final String name;
    private final int age;

    public StringTemplates(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toJson() {
        return STR."""
                {
                    "name": "\{name}",
                    "age": \{age}
                }
                """;
    }
}
