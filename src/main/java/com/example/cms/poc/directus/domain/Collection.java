package com.example.cms.poc.directus.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NonNull;

@Data
public class Collection {
    @NonNull
    @JsonProperty("collection")
    private final String name;
}
