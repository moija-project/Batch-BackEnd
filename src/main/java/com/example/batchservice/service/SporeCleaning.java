package com.example.batchservice.service;
import com.example.batchservice.repository.SporeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SporeCleaning {
    @Autowired
    SporeRepository sporeRepository;
    public void deleteByRecruitId(Long recruitId) {
        sporeRepository.deleteAllByRecruitId(recruitId);
    }
}
