package com.janp.justanormalperson.models;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Marcel.Tavares on 23/06/2017.
 */
@Document(collection = "commonItem")
public class CommonItemModel {
    private String id;
    private String name;

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
