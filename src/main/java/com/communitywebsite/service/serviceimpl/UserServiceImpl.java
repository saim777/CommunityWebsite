package com.communitywebsite.service.serviceimpl;

import com.communitywebsite.dto.UserRegistrationDto;
import com.communitywebsite.model.UserEntity;
import com.communitywebsite.repository.UserRepository;
import com.communitywebsite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserRegistrationDto resgisterUser(UserRegistrationDto userRegistrationDto) {

        UserEntity userEntity=new UserEntity();
        userEntity.setFirstName(userRegistrationDto.getFirstName());
        userEntity.setLastName(userRegistrationDto.getLastName());
        userEntity.setEmail(userRegistrationDto.getEmail());
        userEntity.setEnrollmentNo(userRegistrationDto.getEnrollmentNo());
        userEntity.setMobileNo(userRegistrationDto.getMobileNo());
        userEntity.setPassword(userRegistrationDto.getPassword());
        userEntity.setCollegeName(userRegistrationDto.getCollegeName());
        userEntity.setYearOfAddmission(userRegistrationDto.getYearOfAddmission());
        userEntity.setCourseName(userRegistrationDto.getCourseName());
        userEntity.setCourseStream(userRegistrationDto.getCourseStream());

        userEntity=userRepository.save(userEntity);

        return userEntity!=null ? userRegistrationDto : null;
    }

    @Override
    public UserEntity userLogin(String email, String password) {

        Optional<UserEntity> optionalUser =userRepository.findByEmailAndPassword(email,password);

        if(optionalUser.isPresent()){
           UserEntity user= optionalUser.get();
           return user;
        }
        return null;
    }

}
