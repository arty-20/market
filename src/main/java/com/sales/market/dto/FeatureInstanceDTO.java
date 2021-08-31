package com.sales.market.dto;

import com.sales.market.model.Feature;
import com.sales.market.model.FeatureInstance;
import com.sales.market.model.ModelBase;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Getter
@Setter
public class FeatureInstanceDTO extends DTOBase<FeatureInstance> {
    private String value;
    private Feature feature;

}
