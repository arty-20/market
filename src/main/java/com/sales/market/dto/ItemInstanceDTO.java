package com.sales.market.dto;

import com.sales.market.model.Item;
import com.sales.market.model.ItemInstance;
import com.sales.market.model.ItemInstanceState;
import lombok.Getter;
import lombok.Setter;


/**
 * @author arturo
 */
@Getter
@Setter
public class ItemInstanceDTO extends DTOBase<ItemInstance> {
    private Item item;
    private String identifier;
    private Boolean featured = Boolean.FALSE;

    // todo generalmente se usa BigDecimal
    private Double price;
    private ItemInstanceState itemInstanceState;
}
