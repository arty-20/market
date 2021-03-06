package com.sales.market.model;

import com.sales.market.dto.PositionDTO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

/**
 * @author arturo
 */
@Getter
@Setter
@Entity
public class Position extends ModelBase<PositionDTO> {


    private String name;
}
