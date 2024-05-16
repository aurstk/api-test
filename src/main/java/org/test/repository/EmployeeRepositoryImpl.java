package org.test.repository;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.StoredProcedureQuery;

@ApplicationScoped
public class EmployeeRepositoryImpl implements EmployeeRepository{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public Integer searchEmployeeByNames(String name, String lastName) {

        StoredProcedureQuery query = entityManager
                .createStoredProcedureQuery("ANONYMOUS.PA_EMPLOYEES.sp_search_by_name");
        query.registerStoredProcedureParameter("pa_nombre", String.class, ParameterMode.IN);
        query.registerStoredProcedureParameter("pa_apellido",String.class,ParameterMode.IN );
        query.registerStoredProcedureParameter("pa_codrespuesta", Integer.class,ParameterMode.OUT);


        query.setParameter("pa_nombre",name);
        query.setParameter("pa_apellido",lastName);
        query.execute();

        return (Integer) query.getOutputParameterValue("pa_codrespuesta");
    }





}
