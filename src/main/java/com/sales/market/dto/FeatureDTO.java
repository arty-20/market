package com.sales.market.dto;

import com.sales.market.model.Feature;
import com.sales.market.model.ModelBase;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Getter
@Setter
public class FeatureDTO extends DTOBase<Feature> {
    private String name;

}
