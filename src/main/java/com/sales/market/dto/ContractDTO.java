package com.sales.market.dto;

import com.sales.market.model.Contract;
import com.sales.market.model.Employee;
import com.sales.market.model.ModelBase;
import com.sales.market.model.Position;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.util.Date;

/**
 * @author arturo
 */
@Getter
@Setter
public class ContractDTO extends DTOBase<Contract> {

    private Employee employee;
    private Position position;
    private Date initDate;
    private Date endDate;
    private boolean isActive;
}
