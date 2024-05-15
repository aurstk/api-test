package org.test.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.test.model.Gender;
import org.test.services.GenderService;

import java.util.List;

@Path("/api/genders")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class GenderResource {
    @Inject
    private GenderService genderService;

    @GET
    public List<Gender> getAllGenders() {

        return genderService.getAllGenders();
    }

    @POST
    public Gender saveGender(Gender gender){
        return genderService.saveGender(gender);

    }

}
