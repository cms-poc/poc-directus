package com.example.cms.poc.directus.domain.repositories;

import com.example.cms.poc.directus.domain.Collections;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "collections", url = "http://lamp:8080/_")
public interface ContentRepository {
    @GetMapping("/collections")
    Collections collections(@RequestParam("access_token") String accessToken);
}
