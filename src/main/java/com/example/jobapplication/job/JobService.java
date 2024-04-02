package com.example.jobapplication.job;

import java.util.List;

public interface JobService {
    List<Job> findAll();
    void createJob(Job job);

    Job getJobById(Long id);

    boolean deleteJobyId(Long id);

    boolean updateJobById(Long id, Job updatedJob);
}
