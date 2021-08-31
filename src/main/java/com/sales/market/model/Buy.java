package com.sales.market.model;

import com.sales.market.dto.BuyDTO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.math.BigDecimal;

/**
 * @author arturo
 */
@Getter
@Setter
@Entity
public class Buy extends ModelBase<BuyDTO>{
    @Column(precision = 10, scale = 5)
    private BigDecimal value;
}
