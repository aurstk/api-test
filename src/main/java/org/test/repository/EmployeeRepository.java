package org.test.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.test.model.Employee;

import java.util.List;


public interface EmployeeRepository extends PanacheRepository<Employee> {

    Integer searchEmployeeByNames(String name, String lastName);

}
