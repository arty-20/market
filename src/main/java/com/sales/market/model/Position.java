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
public class Position {

    @Id
    private long id;

    private String name;
}
