package com.example.rybak_kl2tc_sprawdzian.remote.rest.api.dto.response;

public class TokenDto {
    private String Token;

    public TokenDto() {
    }

    public TokenDto(String token) {
        Token = token;
    }

    public String getToken() {
        return Token;
    }

    public void setToken(String token) {
        Token = token;
    }
}
