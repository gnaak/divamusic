package com.checkitout.backend.repository;

import com.checkitout.backend.entity.Member;
import java.util.Optional;

public interface MemberRepositoryQueryDsl {
    Optional<Member> findNotDeletedById(long id);
    Optional<Member> findNotDeletedByEmail(String email);
//    Optional<Member> findNotDeletedByEmailWithRefreshToken(String email);
//    Optional<Member> findNotDeletedByEmailWithSubscription(String email);
//    Optional<Member> findNotDeletedByEmailWithDeviceToken(String email);
//    Optional<Member> findNotDeletedByEmailWithSubscriptionAndDeviceToken(String email);
//    Optional<Member> findNotDeletedByEmailWithRefreshTokenAndSubscriptionAndDeviceToken(String email);
//    Optional<Member> findNotDeletedByRefreshTokenIdWithSubscriptionAndDeviceToken(long refreshTokenId);
//    Optional<Member> findNotDeletedByDeviceTokenIdWithSubscription(long deviceTokenId);
//    Optional<Member> findNotDeletedByPasswordVerificationCode(String passwordVerificationCode);
//    Optional<Member> findNotDeletedByPasswordVerificationCodeWithDeviceTokenAndSubscription(String passwordVerificationCode);
    Optional<Long> findIdByEmail(String email);
    Optional<Long> findNotDeletedIdByEmail(String email);
//    Optional<Member> findNotDeletedByEmailAndDeviceToken(String email);
}
