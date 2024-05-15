package org.test.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.test.model.Gender;

@ApplicationScoped
public class GenderRepository implements PanacheRepository<Gender> {
}
