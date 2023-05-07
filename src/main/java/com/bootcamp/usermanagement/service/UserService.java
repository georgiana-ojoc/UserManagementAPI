package com.bootcamp.usermanagement.service;

import com.bootcamp.usermanagement.exception.FieldAlreadyUsedException;
import com.bootcamp.usermanagement.exception.IncorrectCredentialsException;
import com.bootcamp.usermanagement.exception.UserNotFoundException;
import com.bootcamp.usermanagement.model.request.LoginRequest;
import com.bootcamp.usermanagement.model.request.RegisterOrUpdateRequest;
import com.bootcamp.usermanagement.model.response.GetCurrentUserResponse;
import com.bootcamp.usermanagement.model.response.GetShortProfileResponse;
import com.bootcamp.usermanagement.model.response.RegisterOrUpdateResponse;

public interface UserService {
    String getCurrentEmail();

    RegisterOrUpdateResponse register(RegisterOrUpdateRequest request) throws FieldAlreadyUsedException;

    void login(LoginRequest request) throws IncorrectCredentialsException;

    GetCurrentUserResponse getCurrentUser() throws UserNotFoundException;

    GetShortProfileResponse getProfile(String username) throws UserNotFoundException;

    RegisterOrUpdateResponse update(String username, RegisterOrUpdateRequest request) throws UserNotFoundException,
            FieldAlreadyUsedException;
}
