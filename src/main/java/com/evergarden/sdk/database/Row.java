package com.evergarden.sdk.database;

public class Row implements DBGenerator{
    private String name;

    private TypeRow typeRow;

    private int size;

    private int precision;

    private boolean nullable;

    private boolean unique;

    private boolean autoIncrement;

    private boolean isPrimary;

    private Row(){}

    public static Row withRow(String name) {
        Row row = new Row();
        row.name = name;
        return row;
    }

    public Row setType(TypeRow typeRow) {
        this.typeRow = typeRow;
        return this;
    }

    public Row setSize(int size) {
        this.size = size;
        return this;
    }

    public Row setPrecision(int precision) {
        this.precision = precision;
        return this;
    }

    public Row nullable(boolean nullable) {
        this.nullable = nullable;
        return this;
    }

    public Row primary(boolean primary) {
        isPrimary = primary;
        return this;
    }

    public Row unique(boolean unique) {
        this.unique = unique;
        return this;
    }

    public Row autoIncrement(boolean autoIncrement) {
        this.autoIncrement = autoIncrement;
        return this;
    }

    @Override
    public String compile() {
        Builder result = new Builder();
        result.write(name).write(typeRow.getName());
        return null;
    }
}
