package com.example.batchservice.repository;

import com.example.batchservice.entities.Member;
import com.example.batchservice.entities.Recruit;
import com.example.batchservice.entities.TeamId;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, TeamId> {

    void deleteAllByRecruitId(Long recruitId);
}
