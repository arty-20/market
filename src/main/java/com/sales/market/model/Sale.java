package com.sales.market.model;


import com.sales.market.dto.SaleDTO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
public class Sale extends ModelBase<SaleDTO> {
    @OneToOne(optional = false)
    private Employee employee;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date date;

    private String description;
    private String image;

}
