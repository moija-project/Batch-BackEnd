package com.example.batchservice.service.mongo;


import com.example.batchservice.mongo.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageCleaning {
    @Autowired
    ImageRepository imageRepository;

    public void deleteByRecruitId(Long recruitId) {
        imageRepository.deleteAllByRecruitId(recruitId);
    }
}
