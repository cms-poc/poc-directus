package com.example.cms.poc.directus.domain;

import lombok.Data;
import lombok.NonNull;

import java.util.List;

@Data
public class Collections {
    @NonNull
    private final List<Collection> data;
}
