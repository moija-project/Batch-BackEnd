package com.example.batchservice.repository;

import com.example.batchservice.entities.Recruit;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;


@Repository
public interface RecruitRepository extends JpaRepository<Recruit,Long> {

    void deleteByIsAvailableTrueAndTimeLastWriteBefore(LocalDateTime before);

    List<Recruit> findAllByIsAvailableTrueAndTimeLastWriteBefore(LocalDateTime minusMonths);
}
