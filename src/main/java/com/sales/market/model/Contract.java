package com.sales.market.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author arturo
 */
@Getter
@Setter
@Entity
public class Contract {
    @Id
    private Long id;
//    private Employee employee;
//    private Position position;
    private Date initDate;
    private Date endDate;
}
