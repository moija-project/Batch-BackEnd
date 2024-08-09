package com.example.batchservice.mongo;

import com.example.batchservice.mongo_entity.Condition;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.Update;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConditionRepository extends MongoRepository<Condition,Long> {

    void deleteAllByRecruitId(Long recruitId);
}
