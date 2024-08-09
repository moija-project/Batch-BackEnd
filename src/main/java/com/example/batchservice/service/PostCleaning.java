package com.example.batchservice.service;

import com.example.batchservice.entities.Recruit;
import com.example.batchservice.mongo.ConditionRepository;
import com.example.batchservice.repository.RecruitRepository;
import com.example.batchservice.service.mongo.ConditionCleaning;
import com.example.batchservice.service.mongo.ImageCleaning;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class PostCleaning {
    @Autowired
    RecruitRepository recruitRepository;
    @Autowired
    ClipCleaning clipCleaning;
    @Autowired
    LikeCleaning likeCleaning;

    @Autowired
    SporeCleaning sporeCleaning;

    @Autowired
    MemberCleaning memberCleaning;

    @Autowired
    WaitingCleaning waitingCleaning;

    @Autowired
    ConditionCleaning conditionCleaning;
    @Autowired
    ImageCleaning imageCleaning;

    @Autowired

    public void cleanPost() {
        LocalDateTime before = LocalDateTime.now().minusMonths(3);
        List<Recruit> deleteList = recruitRepository.findAllByIsAvailableTrueAndTimeLastWriteBefore(before);
        for(Recruit r : deleteList) {
            likeCleaning.deleteByRecruitId(r.getRecruitId());
            clipCleaning.deleteByRecruitId(r.getRecruitId());

            sporeCleaning.deleteByRecruitId(r.getRecruitId());
            memberCleaning.deleteByRecruitId(r.getRecruitId());
            waitingCleaning.deleteByRecruitId(r.getRecruitId());

            conditionCleaning.deleteByRecruitId(r.getRecruitId());
            imageCleaning.deleteByRecruitId(r.getRecruitId());
        }

        recruitRepository.deleteByIsAvailableTrueAndTimeLastWriteBefore(before);
    }
}
