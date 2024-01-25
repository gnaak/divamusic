package com.diva.backend.post.repository;

import com.diva.backend.post.entity.PracticeResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResultRepository extends JpaRepository<PracticeResult, Long> {
    List<PracticeResult> SaveResult();
}
