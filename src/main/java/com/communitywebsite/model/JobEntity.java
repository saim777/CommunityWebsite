package com.communitywebsite.model;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@Entity
@NoArgsConstructor
@Table(name = "job")
public class JobEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @NotNull
    @Column(name = "company_name")
    private String companyName;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "posted_date")
    private String postedDate;

    @Column(name = "description")
    private String description;

    @Column(name = "job_requirement")
    private String jobRequirement;


    @Column(name = "salary")
    private String salary;

    @Column(name = "job_type")
    private String jobType;

    @Column(name = "location")
    private String location;

    @Column(name = "link_job")
    private String linkJob;

}

