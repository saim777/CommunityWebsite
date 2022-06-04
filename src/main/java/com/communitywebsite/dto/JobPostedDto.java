package com.communitywebsite.dto;

import lombok.Data;

import javax.persistence.Column;

@Data
public class JobPostedDto {
    private String companyName;

    private String jobTitle;

    private String postedDate;

    private String description;

    private String jobRequirement;

    private String salary;

    private String jobType;

    private String location;

    private String linkJob;
}
