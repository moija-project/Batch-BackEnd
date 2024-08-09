package com.example.batchservice;

import com.example.batchservice.service.PostCleaning;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
public class BatchServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BatchServiceApplication.class, args);
    }
    @Autowired
    private static PostCleaning postCleaning;
    @Scheduled(cron = "0 0 19 ? * 6L")
    public static void clean() {
        postCleaning.cleanPost();
    }

}
