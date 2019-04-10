package com.evergarden.sdk.database;

public class Table implements Migration {
    String name;

    public Table createTable(String name) {
        this.name = name;
        return this;
    }

}
