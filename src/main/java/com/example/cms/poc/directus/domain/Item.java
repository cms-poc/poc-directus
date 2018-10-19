package com.example.cms.poc.directus.domain;

import lombok.Data;
import lombok.NonNull;

@Data
public class Item {
    @NonNull
    private final int id;

    @NonNull
    private final String name;
}
