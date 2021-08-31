package com.sales.market.model;

import com.sales.market.dto.ItemInstanceDTO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToOne;

@Getter
@Setter
@Entity
public class ItemInstance extends ModelBase<ItemInstanceDTO> {
    @OneToOne
    private Item item;
    private String identifier;// sku

    private Boolean featured = Boolean.FALSE;

    // todo generalmente se usa BigDecimal
    private Double price;

    @Enumerated(EnumType.STRING)
     private ItemInstanceState itemInstanceState;

    // todo agregar totalCost



//    @Override
//    public ModelBase toDomain(ItemInstanceDTO element, ModelMapper mapper) {
//        super.toDomain(element, mapper);
//        setItem((Item) new Item().toDomain(element.getItemDto(), mapper));
//        return this;
//    }
}
