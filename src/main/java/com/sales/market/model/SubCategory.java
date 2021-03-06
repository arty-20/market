package com.sales.market.model;

import com.sales.market.dto.SubCategoryDTO;
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
public class SubCategory extends ModelBase<SubCategoryDTO> {
    private String name;
    private String code;

    @OneToOne(optional = false)
    private Category category;
}
