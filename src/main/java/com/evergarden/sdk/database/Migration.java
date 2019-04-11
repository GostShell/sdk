package com.evergarden.sdk.database;

import org.jooq.DSLContext;


public interface Migration {
    void execute(DSLContext jooq);
}
