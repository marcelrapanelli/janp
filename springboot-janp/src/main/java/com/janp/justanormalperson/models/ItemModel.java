package com.janp.justanormalperson.models;

import com.janp.justanormalperson.types.AttBonusType;

import java.util.List;

/**
 * Created by Marcel.Tavares on 07/07/2017.
 */
public class ItemModel {
    private String id;
    private String name;
    private List<AttBonusType> properties;

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

    public List<AttBonusType> getProperties() {
        return properties;
    }

    public void setProperties(List<AttBonusType> properties) {
        this.properties = properties;
    }
}
