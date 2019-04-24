package com.evergarden.sdk.database;

import org.jooq.DSLContext;

public class Table implements Migration {
    String name;

    public Table createTable(String name) {
        this.name = name;
        return this;
    }

    @Override
    public void execute(DSLContext jooq) {

    }

    @Override
    public void execute(String text) {

    }
}
