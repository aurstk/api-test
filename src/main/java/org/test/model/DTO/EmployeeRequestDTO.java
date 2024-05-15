package org.test.model.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class EmployeeRequestDTO {
    private long id;
    private long gender_id;
    private long job_id;
    private String  name;
    private String last_name;
    private LocalDate birthdate;
    public EmployeeRequestDTO() {
    }
}
