package com.example.batchservice.service;
import com.example.batchservice.entities.Waiting;
import com.example.batchservice.mongo.AnswerRepository;
import com.example.batchservice.repository.WaitingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WaitingCleaning {
    @Autowired
    WaitingRepository waitingRepository;

    @Autowired
    AnswerRepository answerRepository;
    public void deleteByRecruitId(Long recruitId) {
        List<Waiting> list = waitingRepository.findAllByRecruitId(recruitId);
        for(Waiting w : list)
            answerRepository.deleteAllByWaitingId(w.getWaitingId());
        waitingRepository.deleteAllByRecruitId(recruitId);

    }
}
