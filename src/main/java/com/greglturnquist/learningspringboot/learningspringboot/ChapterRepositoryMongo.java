package com.greglturnquist.learningspringboot.learningspringboot;

import org.springframework.data.mongodb.repository.MongoRepository;

// mongo --port <port is random...see the log>
public interface ChapterRepositoryMongo
        extends MongoRepository<Chapter, String> {

}