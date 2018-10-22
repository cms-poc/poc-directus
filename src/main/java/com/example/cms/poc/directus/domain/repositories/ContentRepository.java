package com.example.cms.poc.directus.domain.repositories;

import com.example.cms.poc.directus.domain.Collection;
import com.example.cms.poc.directus.domain.Collections;
import com.example.cms.poc.directus.domain.Item;
import com.example.cms.poc.directus.domain.Items;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient("content")
public interface ContentRepository {
    @GetMapping("/_/collections")
    Collections collections(@RequestParam("access_token") String accessToken);

    @PostMapping("/_/collections")
    void addCollection(@RequestBody Collection collection, @RequestParam("access_token") String accessToken);

    @GetMapping("/_/items/{collection}")
    Items items(@PathVariable("collection") String collection, @RequestParam("access_token") String accessToken);

    @PostMapping("/_/items/{collection}")
    void addItem(@PathVariable("collection") String collection, @RequestBody Item item, @RequestParam("access_token") String accessToken);
}
