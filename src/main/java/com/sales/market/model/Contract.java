package com.sales.market.model;

import com.sales.market.dto.ContractDTO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/**
 * @author arturo
 */
@Getter
@Setter
@Entity
public class Contract extends ModelBase<ContractDTO> {

    @ManyToOne(optional = false)
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @OneToOne(optional = false)
    private Position position;

    private Date initDate;
    private Date endDate;

    private boolean isActive;
}
