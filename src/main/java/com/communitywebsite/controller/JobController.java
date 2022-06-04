package com.communitywebsite.controller;

import com.communitywebsite.dto.JobPostedDto;
import com.communitywebsite.model.JobEntity;
import com.communitywebsite.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/job")
public class JobController {
    @Autowired
    private JobService jobService;

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/postJob")
    public ResponseEntity<JobPostedDto> postjob(@RequestBody JobPostedDto jobPostedDto){
        var responseJobpostedDto=jobService.postJob(jobPostedDto);
        if(responseJobpostedDto==null) new ResponseEntity<>("Something went wrong in JobController",HttpStatus.INTERNAL_SERVER_ERROR);
        return new ResponseEntity<>(responseJobpostedDto,HttpStatus.CREATED);
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/getJob")
    public ResponseEntity<List<JobEntity>> findAllJobs(){
        var responseList=jobService.findAllJobs();
        return new ResponseEntity<>(responseList, HttpStatus.OK);
    }
}
