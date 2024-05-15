package org.test.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.test.model.Job;
import org.test.services.JobService;

import java.util.List;

@Path("/api/jobs")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class JobResource {
    @Inject
    private JobService jobService;

    @GET
    public List<Job> getAllJobs() {

        return jobService.getAllJobs();
    }

    @POST
    public Job saveJob(Job job){
        return jobService.saveJob(job);

    }
}
