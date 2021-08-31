package com.sales.market.dto;

import com.sales.market.model.Item;
import com.sales.market.model.ModelBase;
import com.sales.market.model.SubCategory;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 * @author arturo
 */
@Getter
@Setter
public class ItemDTO extends DTOBase<Item> {
    private String name;
    private String code;
    private Byte[] image;

    private SubCategory subCategory;
}
