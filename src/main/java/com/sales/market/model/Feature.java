package com.sales.market.model;

import com.sales.market.dto.FeatureDTO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
@Entity
public class Feature extends ModelBase<FeatureDTO> {
    private String name;

}
