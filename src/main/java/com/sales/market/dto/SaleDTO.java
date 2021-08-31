package com.sales.market.dto;


import com.sales.market.model.Employee;
import com.sales.market.model.ModelBase;
import com.sales.market.model.Sale;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
public class SaleDTO extends DTOBase<Sale> {

    private Employee employee;
    private Date date;
    private String description;
    private String image;

}
