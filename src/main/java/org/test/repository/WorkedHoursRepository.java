package org.test.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.test.model.WorkedHours;

@ApplicationScoped
public class WorkedHoursRepository implements PanacheRepository<WorkedHours> {
}
