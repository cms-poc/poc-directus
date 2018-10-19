package com.example.cms.poc.directus.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NonNull;

import java.util.List;

@Data
public class Collections {
    @NonNull
    @JsonProperty("data")
    private final List<Collection> collections;
}
