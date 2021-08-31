package com.sales.market.dto;

import com.sales.market.model.Position;
import lombok.Getter;
import lombok.Setter;

/**
 * @author arturo
 */
@Getter
@Setter
public class PositionDTO extends DTOBase<Position> {

    private String name;
}
