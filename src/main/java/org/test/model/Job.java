package org.test.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "JOBS", schema = "ANONYMOUS")
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Job {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SE_JOB")
    @SequenceGenerator(name = "SE_JOB", sequenceName = "SE_JOB", allocationSize = 1, initialValue = 1)
    @Column(name = "ID")
    private long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "SALARY")
    private Float salary;

    public Job() {
    }
}
