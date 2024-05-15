package org.test.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.test.model.Job;

@ApplicationScoped
public class JobRepository implements PanacheRepository<Job> {
}
