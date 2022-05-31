package com.communitywebsite.controller;

import com.communitywebsite.dto.EventPostedDto;
import com.communitywebsite.dto.JobPostedDto;
import com.communitywebsite.model.EventEntity;
import com.communitywebsite.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/event")
public class EventController {
    @Autowired
    private EventService eventService;


    @PostMapping("/postEvent")
    public ResponseEntity<EventPostedDto> postEvent(@RequestBody EventPostedDto eventPostedDto){
        var responseEventpostedDto=eventService.postEvent(eventPostedDto);
        if(responseEventpostedDto==null) new ResponseEntity<>("Something went wrong in JobController",HttpStatus.INTERNAL_SERVER_ERROR);
        return new ResponseEntity<>(responseEventpostedDto,HttpStatus.CREATED);
    }


    @GetMapping("/getAllEvent")
    public ResponseEntity<List<EventEntity>> getAllEvent(){
        var responseList=eventService.getAllEvent();
        return new ResponseEntity<>(eventService.getAllEvent(), HttpStatus.OK);
    }

}
