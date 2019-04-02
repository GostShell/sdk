package com.evergarden.sdk.database;

public enum TypeRow {
    tinyInt("TINYINT", true, false),
    smallInt("SMALLINT", true, false),
    integer("INT", true, false),
    bigInt("BIGINT", true, false),
    floater("FLOAT", true, true),
    doubler("DOUBLE", true, true),
    decimaler("DECIMAL", true, true),
    varChar("VARCHAR", false, true),
    text("TEXT", false, true),
    blob("BLOB", false, false),
    binary("BINARY", false, false),
    time("TIME", false, false),
    date("DATE", false, false);

    private String  name;
    private boolean isNumeric;
    private boolean requiredParam;

    TypeRow(String name, boolean isNumeric, boolean requiredParam) {
        this.name = name;
        this.isNumeric = isNumeric;
        this.requiredParam = requiredParam;
    }

    public String getName() {
        return name;
    }

    public boolean isNumeric() {
        return isNumeric;
    }

    public boolean isRequiredParam() {
        return requiredParam;
    }
}
