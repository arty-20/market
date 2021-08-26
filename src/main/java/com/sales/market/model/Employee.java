package com.sales.market.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

/**
 * @author arturo
 */
@Getter
@Setter
@Entity
public class Employee {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private Byte[] image;
//    private List<Contract> contracts;
}
