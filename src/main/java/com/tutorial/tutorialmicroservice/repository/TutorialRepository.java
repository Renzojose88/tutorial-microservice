package com.tutorial.tutorialmicroservice.repository;

import com.tutorial.tutorialmicroservice.entity.Tutorial;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorialRepository extends MongoRepository<Tutorial,String> {
}
