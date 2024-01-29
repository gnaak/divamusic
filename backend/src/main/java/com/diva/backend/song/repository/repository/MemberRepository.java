package com.diva.backend.song.repository.repository;

import com.diva.backend.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long>, MemberRepositoryQueryDsl {
    Optional<Member> findMemberByEmail(String email);
    Optional<Member> findNotDeletedById(long id);
    Optional<Member> findNotDeletedByEmail(String email);
    Optional<Long> findIdByEmail(String email);
    Optional<Long> findNotDeletedIdByEmail(String email);
}