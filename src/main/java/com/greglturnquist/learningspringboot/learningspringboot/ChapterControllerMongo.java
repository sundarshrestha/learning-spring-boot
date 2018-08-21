package com.greglturnquist.learningspringboot.learningspringboot;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChapterControllerMongo {

    private final ChapterRepositoryMongo repository;

    public ChapterControllerMongo(ChapterRepositoryMongo repository) {
        this.repository = repository;
    }

    @GetMapping("/chapters-mongo")
    public List<Chapter> listing() {
        List<Chapter> values = repository.findAll();
        return values;
    }

    @GetMapping("/chapter-by-id-mongo")
    public Optional<Chapter> findById(@RequestParam(required = true) String id) {
        Optional<Chapter> value = repository.findById(id);
        return value;
    }

}