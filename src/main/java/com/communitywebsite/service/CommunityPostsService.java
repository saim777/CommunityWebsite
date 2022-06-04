package com.communitywebsite.service;

import com.communitywebsite.dto.CommunityPostDto;
import com.communitywebsite.model.CommunityPostEntity;

import java.util.List;

public interface CommunityPostsService {
    List<CommunityPostEntity> getAllPosts();

    CommunityPostDto publishPost(CommunityPostDto communityPostDto);
}
