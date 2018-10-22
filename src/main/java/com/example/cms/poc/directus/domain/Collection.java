package com.example.cms.poc.directus.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Getter
@Setter
public class Collection {
    @NonNull
    @JsonProperty("collection")
    private String name;

    @NonNull
    private Boolean managed;

    @NonNull
    private Boolean hidden;

    @NonNull
    private Boolean single;

    @NonNull
    private String note;

    @NonNull
    private Field[] fields;

    public Collection() {
        this.name = "";
        this.managed = false;
        this.hidden = false;
        this.single = false;
        this.note = "";
        this.fields = new Field[0];
    }

    public Collection withPrimaryKey(String name) {
        Field[] newFields = new Field[fields.length + 1];
        System.arraycopy(fields, 0, newFields, 0, fields.length);
        newFields[fields.length] = new Field(name, "integer", "int", "primary_key", true, true, 10, false);
        fields = newFields;
        return this;
    }

    public Collection withStringField(String name, int length, boolean required, String note) {
        Field[] newFields = new Field[fields.length + 1];
        System.arraycopy(fields, 0, newFields, 0, fields.length);
        newFields[fields.length] = new Field(name, "string", "varchar", "text-input", length, required, note);
        fields = newFields;
        return this;
    }
}
