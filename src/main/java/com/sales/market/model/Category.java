package com.sales.market.model;

import com.sales.market.dto.CategoryDTO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

/**
 * @author arturo
 */
@Getter
@Setter
@Entity
public class Category extends ModelBase<CategoryDTO> {
    private String name;
    private String code;
}
