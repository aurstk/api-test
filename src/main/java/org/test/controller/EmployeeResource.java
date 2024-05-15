package org.test.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.test.model.DTO.EmployeeRequestDTO;
import org.test.model.Employee;
import org.test.services.EmployeeService;

import java.util.List;

@Path("/api/employees")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EmployeeResource {

    @Inject
    private EmployeeService employeeService;

    @GET
    public List<Employee> getAllEmployees() {

        return employeeService.getAllEmployees();
    }
    @GET
    public List<Employee> getAllEmployeesByJob() {

        return employeeService.getAllEmployees();
    }

    @POST
    public Response saveEmployee(EmployeeRequestDTO employeeRequestDTO){


        return employeeService.saveEmployeeWithReferences(employeeRequestDTO);

    }


}
