package com.example.cms.poc.directus.domain.repositories;

import com.example.cms.poc.directus.domain.Collections;
import com.example.cms.poc.directus.domain.Items;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "collections", url = "http://lamp:8080/_")
public interface ContentRepository {
    @GetMapping("/collections")
    Collections collections(@RequestParam("access_token") String accessToken);

    @GetMapping("/items/{collection}")
    Items items(@PathVariable("collection") String collection, @RequestParam("access_token") String accessToken);
}
