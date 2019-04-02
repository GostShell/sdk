package com.evergarden.sdk.database;

public class Builder {
    private String instance;

    public Builder() {
        instance = "";
    }

    public Builder write(String text) {
        instance += text + " ";
        return this;
    }

    public Builder breakLine() {
        instance += "\n";
        return this;
    }

    public Builder end(String text) {
        instance += text;
        return this;
    }
}
