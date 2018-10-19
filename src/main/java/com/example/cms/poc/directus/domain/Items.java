package com.example.cms.poc.directus.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NonNull;

import java.util.List;

@Data
public class Items {
    @NonNull
    @JsonProperty("data")
    private final List<Item> items;
}
