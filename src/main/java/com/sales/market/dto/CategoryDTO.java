package com.sales.market.dto;

import com.sales.market.model.Category;
import com.sales.market.model.ModelBase;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

/**
 * @author arturo
 */
@Getter
@Setter
public class CategoryDTO extends DTOBase<Category> {
    private String name;
    private String code;
}
