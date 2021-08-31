package com.sales.market.dto;

import com.sales.market.model.Buy;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author arturo
 */
@Getter
@Setter
public class BuyDTO extends DTOBase<Buy>{
    private BigDecimal value;
}
