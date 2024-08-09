package com.example.batchservice.service;

import com.example.batchservice.repository.LikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikeCleaning {
    @Autowired
    LikeRepository likeRepository;
    public void deleteByRecruitId(Long recruitId) {
        likeRepository.deleteAllByRecruitId(recruitId);
    }
}
