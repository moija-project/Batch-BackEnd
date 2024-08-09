package com.example.batchservice.service;
import com.example.batchservice.repository.ClipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClipCleaning {
    @Autowired
    ClipRepository clipRepository;
    public void deleteByRecruitId(Long recruitId) {
        clipRepository.deleteAllByRecruitId(recruitId);
    }
}
