package org.test.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@ToString
@Table(name = "EMPLOYEES", schema = "ANONYMOUS")
public class Employee extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SE_EMPLOYEE")
    @SequenceGenerator(name = "SE_EMPLOYEE", sequenceName = "SE_EMPLOYEE", allocationSize = 1, initialValue = 1)
    @Column(name = "ID")
    private long id;

    @ManyToOne
    @JsonIgnoreProperties("Employee")
    @JoinColumn(name = "gender_id", referencedColumnName = "id")
    private Gender gender;

    @ManyToOne
    @JsonIgnoreProperties("Employee")
    @JoinColumn(name = "job_id", referencedColumnName = "id")
    private Job job;
    @Column(name = "NAME")
    private String  name;
    @Column(name = "LAST_NAME")
    private String last_name;
    @Column(name = "BIRTHDATE")
    private LocalDate birthdate;

    public Employee() {
    }
}
