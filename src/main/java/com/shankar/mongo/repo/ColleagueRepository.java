package com.shankar.mongo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.shankar.mongo.model.Colleague;

import java.util.List;

/**
 * Created by bartoszjedrzejewski on 31/10/2016.
 */
public interface ColleagueRepository extends MongoRepository<Colleague, String> {

    public List<Colleague> findByName(String name);

}