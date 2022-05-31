package com.communitywebsite.service;

import com.communitywebsite.dto.UserRegistrationDto;
import com.communitywebsite.model.UserEntity;

public interface UserService {
    UserRegistrationDto resgisterUser(UserRegistrationDto userRegistrationDto);
    UserEntity userLogin(String email, String password);
}
