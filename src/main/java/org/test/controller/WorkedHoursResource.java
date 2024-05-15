package org.test.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.test.model.WorkedHours;
import org.test.services.WorkedHoursService;

import java.util.List;

@Path("/api/worked-hours")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class WorkedHoursResource {

    @Inject
    private WorkedHoursService workedHoursService;

    @GET
    public List<WorkedHours> getAllWorkedHours() {

        return workedHoursService.getAllWorkedHours();
    }

    @POST
    public WorkedHours saveWorkedHours(WorkedHours workedHours){
        return workedHoursService.saveWorkedHours(workedHours);

    }

}
