package com.greglturnquist.learningspringboot.learningspringboot;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

//@Data // THIS STUPID ANNOTATION is supposed to take care of getter/setter. It does it's job. however,
// JSON parser is not able to find the getter/setter and all the fields are left empty
@Document
public class Chapter {

    @Id
    private String id;
    private String name;

    public Chapter(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Chapter{" +
               "id='" + id + '\'' +
               ", name='" + name + '\'' +
               '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}