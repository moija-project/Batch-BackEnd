package com.example.batchservice.service.mongo;

import com.example.batchservice.mongo.ConditionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConditionCleaning {
    @Autowired
    ConditionRepository conditionRepository;

    public void deleteByRecruitId(Long recruitId) {
        conditionRepository.deleteAllByRecruitId(recruitId);
    }
}
