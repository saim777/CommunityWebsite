package com.communitywebsite.service.serviceimpl;

import com.communitywebsite.dto.CommunityPostDto;
import com.communitywebsite.model.CommunityPostEntity;
import com.communitywebsite.model.EventEntity;
import com.communitywebsite.repository.CommunityPostRepository;
import com.communitywebsite.service.CommunityPostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommunityPostServiceImpl implements CommunityPostsService {

    @Autowired
    CommunityPostRepository communityPostRepository;

    @Override
    public List<CommunityPostEntity> getAllPosts() {
        return findAllEvent();
    }

    @Override
    public CommunityPostDto publishPost(CommunityPostDto communityPostDto) {

        CommunityPostEntity communityPostEntity = CommunityPostEntity.builder()
                .body(communityPostDto.getBody())
                .category(communityPostDto.getCategory())
                .dateAndTime(communityPostDto.getDateAndTime())
                .userName(communityPostDto.getUsername())
                .title(communityPostDto.getTitle())
                .build();

        System.out.println("we are in post");

        communityPostEntity = communityPostRepository.save(communityPostEntity);

        return communityPostEntity!=null ? communityPostDto : null;
    }


    private List<CommunityPostEntity> findAllEvent() {
        return communityPostRepository.findAll();
    }




}
