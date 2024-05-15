package org.test.services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.test.model.Job;
import org.test.repository.JobRepository;

import java.util.List;

@ApplicationScoped
public class JobService {

    @Inject
    JobRepository jobRepository;

    @Transactional
    public List<Job> getAllJobs(){
        return jobRepository.listAll();
    }
    @Transactional
    public Job saveJob(Job job){
        jobRepository.persist(job);
        return job;
    }
}
