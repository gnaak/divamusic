package com.checkitout.backend.auth.dto;

import static lombok.AccessLevel.PROTECTED;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = PROTECTED, force = true)
public class KakaoOAuthResponse {
    private final String registrationId;
    private final Long providerId;
    private final String email;
    private final String resourceAccessToken;
    private final String resourceRefreshToken;
    private final String scope;

    @Builder
    protected KakaoOAuthResponse(String registrationId, Long providerId, String email, String resourceAccessToken, String resourceRefreshToken, String scope) {
        this.registrationId = registrationId;
        this.providerId = providerId;
        this.email = email;
        this.resourceAccessToken = resourceAccessToken;
        this.resourceRefreshToken = resourceRefreshToken;
        this.scope = scope;
    }
}