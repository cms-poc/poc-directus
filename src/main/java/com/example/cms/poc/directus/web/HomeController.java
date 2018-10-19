package com.example.cms.poc.directus.web;

import com.example.cms.poc.directus.domain.Collection;
import com.example.cms.poc.directus.domain.repositories.ContentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class HomeController {
    private final ContentRepository contentRepository;

    @ModelAttribute("collections")
    public List<Collection> collections() {
        return contentRepository.collections("admin_token").getData();
    }

    @GetMapping("/")
    public String home() {
        return "home";
    }
}
