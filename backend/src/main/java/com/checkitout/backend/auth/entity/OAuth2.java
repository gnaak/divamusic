package com.checkitout.backend.auth.entity;

import com.checkitout.backend.entity.Member;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.IDENTITY;
import static lombok.AccessLevel.PROTECTED;

@Getter
@Entity
@NoArgsConstructor(access = PROTECTED)
public class OAuth2 {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @JsonBackReference
    @NotNull
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "MEMBER_ID")
    private Member member;

    // 우리가 정한 OAuth2.0 provider의 이름(Ex. kakao, naver)
    @NotBlank
    private String registrationId;

    // OAuth2.0 provider에서 제공하는 유저의 고유 Id
    @NotNull
    private Long providerId;

    // OAuth2.0 provider에서 제공하는 AccessToken와 JWT Refresh Token
    @NotNull
    @OneToMany(mappedBy = "oAuth2")
    private List<Token> token = new ArrayList<>();

    @Builder
    protected OAuth2(Member member, String registrationId, Long providerId) {
        this.member = member;
        this.registrationId = registrationId;
        this.providerId = providerId;

        // 양방향 연관관계 설정
        member.addOAuth2(this);
    }

    // == 비즈니스 로직 == //
    public void addToken(Token token) {
        this.token.add(token);
    }
}