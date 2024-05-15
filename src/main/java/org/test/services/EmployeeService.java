package org.test.services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;
import org.test.model.DTO.EmployeeRequestDTO;
import org.test.model.DTO.ResponseDTO;
import org.test.model.Employee;
import org.test.model.Gender;
import org.test.model.Job;
import org.test.repository.EmployeeRepository;
import org.test.repository.JobRepository;

import java.util.List;

import static org.test.utility.ValidarEdad.esMayorDeEdad;

@ApplicationScoped
public class EmployeeService {

    @Inject
    EmployeeRepository employeeRepository;
    @Inject
    EntityManager entityManager;
    @Inject
    JobRepository jobRepository;

    @Transactional
    public List<Employee> getAllEmployees(){
        return employeeRepository.listAll();
    }
  /*  @Transactional
    public List<Employee> getAllEmployeesByJob(Long id_job){

        Job job = jobRepository.findById(id_job);
        return employeeRepository.findAllByJob();
    }*/

    @Transactional
    public Response saveEmployeeWithReferences(EmployeeRequestDTO employeeRequest) {
        ResponseDTO response = new ResponseDTO();
        int edadMinima = 18;
        try {
            Gender gender = entityManager.find(Gender.class, employeeRequest.getGender_id());
            Job job = entityManager.find(Job.class, employeeRequest.getJob_id());

            if (gender == null || job == null || !(esMayorDeEdad( employeeRequest.getBirthdate(), edadMinima)) ) {
                throw new RuntimeException("datos incorrectos");
            }
            Employee employee = new Employee();
            employee.setGender(gender);
            employee.setJob(job);
            employee.setName(employeeRequest.getName());
            employee.setLast_name(employeeRequest.getLast_name());
            employee.setBirthdate(employeeRequest.getBirthdate());

            employeeRepository.persist(employee);
            response.setId(employee.getId());
            response.setSuccess("true");

            return Response.status(Response.Status.CREATED)
                    .entity(response)
                    .build();

        } catch (Exception e) {
            response.setId(null);
            response.setSuccess("false");

            return Response.status(Response.Status.INTERNAL_SERVER_ERROR)
                    .entity(response).build();
        }
    }

    public boolean existeEmpleado(){
        return false;
    }
}
