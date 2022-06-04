package com.communitywebsite.dto;

import com.communitywebsite.model.UserEntity;
import lombok.Data;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
public class CommunityPostDto {

    private Long id;

    private String dateAndTime;

    private String title;

    private String body;

    private String category;

    private String username;

    //private UserEntity user;
}
