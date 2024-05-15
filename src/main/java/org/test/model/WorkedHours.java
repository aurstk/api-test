package org.test.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@Table(name = "EMPLOYEE_WORKED_HOURS", schema = "ANONYMOUS")
public class WorkedHours {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SE_WORKEDHOURS")
    @SequenceGenerator(name = "SE_WORKEDHOURS", sequenceName = "SE_WORKEDHOURS", allocationSize = 1, initialValue = 1)
    @Column(name = "ID")
    private long id;

    @ManyToOne
    @JsonIgnoreProperties("WorkedHours")
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    private Employee employee;
    @Column(name = "WORKEDHOURS")
    private Integer workedHours;
    @Column(name = "WORKEDDATE")
    private LocalDate workedDate;

    public WorkedHours() {
    }
}
