package com.example.batchservice.mongo;

import com.example.batchservice.mongo_entity.Image;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.Update;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ImageRepository extends MongoRepository<Image,Long> {

    void deleteAllByRecruitId(Long recruitId);
}
