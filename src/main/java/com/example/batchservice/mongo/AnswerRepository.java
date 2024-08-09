package com.example.batchservice.mongo;

import com.example.batchservice.mongo_entity.Answer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnswerRepository extends MongoRepository<Answer,Long> {

    void deleteAllByWaitingId(Long waitingId);

}
