package br.com.rafacdev.kafka.kafkaspringproducer;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.text.MessageFormat;

public class Coffer {

    @JsonProperty
    private int id;
    @JsonProperty
    private String name;
    @JsonProperty
    private int age;

    @JsonCreator
    public Coffer(@JsonProperty("id") int id,
                  @JsonProperty("name") String name,
                  @JsonProperty("age") int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return MessageFormat.format("Cat [id={0}, name={1}, age={2}]", id, name, age);
    }
}
