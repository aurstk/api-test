package org.test.services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.test.model.Employee;
import org.test.model.WorkedHours;
import org.test.repository.EmployeeRepository;
import org.test.repository.WorkedHoursRepository;

import java.util.List;

@ApplicationScoped
public class WorkedHoursService {
    @Inject
    WorkedHoursRepository workedHoursRepository;

    @Transactional
    public List<WorkedHours> getAllWorkedHours(){
        return workedHoursRepository.listAll();
    }
    @Transactional
    public WorkedHours saveWorkedHours(WorkedHours workedHours){
        workedHoursRepository.persist(workedHours);
        return workedHours;
    }
}
