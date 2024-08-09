package com.example.batchservice.service;
import com.example.batchservice.entities.Member;
import com.example.batchservice.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberCleaning {
    @Autowired
    MemberRepository repository;
    public void deleteByRecruitId(Long recruitId) {
        repository.deleteAllByRecruitId(recruitId);
    }
}
