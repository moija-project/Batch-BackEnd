package com.example.batchservice.repository;

import com.example.batchservice.entities.Spore;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SporeRepository extends JpaRepository<Spore,Long> {


    void deleteAllByRecruitId(Long recruitId);
}
