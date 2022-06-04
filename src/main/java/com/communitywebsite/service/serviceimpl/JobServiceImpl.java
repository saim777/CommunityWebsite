package com.communitywebsite.service.serviceimpl;


import com.communitywebsite.dto.JobPostedDto;
import com.communitywebsite.dto.UserRegistrationDto;
import com.communitywebsite.model.JobEntity;
import com.communitywebsite.model.UserEntity;
import com.communitywebsite.repository.JobRepository;
import com.communitywebsite.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements JobService {

    @Autowired
    private JobRepository jobRepository;


    @Override
    public JobPostedDto postJob(JobPostedDto jobPostedDto) {

      JobEntity jobEntity=new JobEntity();
      jobEntity.setJobType(jobPostedDto.getJobType());
      jobEntity.setJobRequirement(jobPostedDto.getJobRequirement());
      jobEntity.setJobTitle(jobPostedDto.getJobTitle());
      jobEntity.setCompanyName(jobPostedDto.getCompanyName());
      jobEntity.setDescription(jobPostedDto.getDescription());
      jobEntity.setLocation(jobPostedDto.getLocation());
      jobEntity.setSalary(jobPostedDto.getSalary());
      jobEntity.setPostedDate(jobPostedDto.getPostedDate());
      jobEntity.setLinkJob(jobPostedDto.getLinkJob());

      jobEntity=jobRepository.save(jobEntity);

      return jobEntity!=null ? jobPostedDto : null;


    }

    @Override
    public List<JobEntity> findAllJobs() {
        return getAllJobs();
    }

    private List<JobEntity> getAllJobs() {
        return jobRepository.findAll();
    }
}
