package com.demo.profile;

public class Food {
    private int _id;
    private String name;
    private String description;

    public Food(int id, String name, String description) {
        _id = id;
        this.name = name;
        this.description = description;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public int get_id() {
        return _id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
