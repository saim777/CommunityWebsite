package com.communitywebsite.service;

import com.communitywebsite.dto.JobPostedDto;
import com.communitywebsite.model.JobEntity;
import org.springframework.stereotype.Service;

import java.util.List;

public interface JobService {
    JobPostedDto postJob(JobPostedDto jobPostedDto);
    List<JobEntity> findAllJobs();
}
