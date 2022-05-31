package com.communitywebsite.dto;

import lombok.Data;

import javax.persistence.Column;

@Data
public class UserRegistrationDto {
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private Long mobileNo;
    private Long enrollmentNo;
    private String collegeName;
    private int yearOfAddmission;
    private String courseName;
    private String courseStream;
}
