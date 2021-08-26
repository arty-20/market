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
public class Item {
    @Id
    private Long id;
    private String name;
    private String code;
    private Byte[] image;
//    private SubCategory subCategory;
}
