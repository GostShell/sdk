package com.evergarden.sdk.database;

public class Table {
    String name;

    public Table createTable(String name) {
        this.name = name;
        return this;
    }

}
