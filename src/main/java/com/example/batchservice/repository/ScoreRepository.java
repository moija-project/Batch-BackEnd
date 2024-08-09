package com.example.batchservice.repository;

import com.example.batchservice.entities.Spore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScoreRepository extends JpaRepository<Spore,Long> {

}
