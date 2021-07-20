package com.vivek.jwt.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author viveksoni100
 */
@Getter
@AllArgsConstructor
public class AuthenticationResponse {

    private final String jwt;
}
