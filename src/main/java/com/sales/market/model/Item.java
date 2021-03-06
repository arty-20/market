package com.sales.market.model;

import com.sales.market.dto.ItemDTO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 * @author arturo
 */
@Getter
@Setter
@Entity
public class Item extends ModelBase<ItemDTO> {
    private String name;
    private String code;
    private Byte[] image;

    @OneToOne(targetEntity = SubCategory.class)
    private SubCategory subCategory;
}
