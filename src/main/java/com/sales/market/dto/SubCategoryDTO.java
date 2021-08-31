package com.sales.market.dto;

import com.sales.market.model.Category;
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
public class SubCategoryDTO extends DTOBase<SubCategory> {
    private String name;
    private String code;

    private Category category;
}
