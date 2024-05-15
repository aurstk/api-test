package org.test.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "GENDERS", schema = "ANONYMOUS")
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Gender extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SE_GENDER")
    @SequenceGenerator(name = "SE_GENDER", sequenceName = "SE_GENDER", allocationSize = 1, initialValue = 1)
    @Column(name = "ID")
    private long id;
    @Column(name = "NAME")
    private String name;

    public Gender() {
    }
}
