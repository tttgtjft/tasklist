package ru.odincov.tasklist.service;

import ru.odincov.tasklist.web.dto.auth.JwtRequest;
import ru.odincov.tasklist.web.dto.auth.JwtResponse;

public interface AuthService {

    JwtResponse login(JwtRequest loginRequest);

    JwtResponse refresh(String refreshToken);

}
