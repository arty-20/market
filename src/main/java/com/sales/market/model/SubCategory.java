package com.sales.market.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author arturo
 */
@Getter
@Setter
@Entity
public class SubCategory {
    @Id
    private Long id;
    private String name;
    private String code;
//    private Category category;
}
