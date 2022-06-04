package com.communitywebsite.controller;

import com.communitywebsite.dto.CommunityPostDto;
import com.communitywebsite.model.CommunityPostEntity;
import com.communitywebsite.service.CommunityPostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/community")
public class CommunityPostController {

    @Autowired
    CommunityPostsService communityPostService;



    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/getAllPosts")
    public ResponseEntity<List<CommunityPostEntity>> getAllPosts(){
        var responseList = communityPostService.getAllPosts();
        return new ResponseEntity<>(responseList, HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/post")
    public ResponseEntity<CommunityPostDto> publishPost(@RequestBody CommunityPostDto communityPostDto){
        var responseCommunityPostedDto = communityPostService.publishPost(communityPostDto);
        if(responseCommunityPostedDto==null) new ResponseEntity<>("Something went wrong in CommunityPostController",HttpStatus.INTERNAL_SERVER_ERROR);
        return new ResponseEntity<>(responseCommunityPostedDto,HttpStatus.CREATED);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/hello")
    public String welcomePage(){
        System.out.println("Hello Welcome to my Page");
        return "hello welcome";
    }



}
