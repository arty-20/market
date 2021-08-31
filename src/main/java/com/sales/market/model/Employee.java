package com.sales.market.model;

import com.sales.market.dto.EmployeeDTO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.CascadeType.*;
import static javax.persistence.FetchType.LAZY;

/**
 * @author arturo
 */
@Getter
@Setter
@Entity
public class Employee extends ModelBase<EmployeeDTO> {
    private String firstName;
    private String lastName;
    private Byte[] image;

    @OneToMany(mappedBy = "employee", fetch = LAZY, cascade = {MERGE, PERSIST, REMOVE})
    private List<Contract> contracts;
}
