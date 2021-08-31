package com.sales.market.model;

import com.sales.market.dto.FeatureInstanceDTO;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
public class FeatureInstance extends ModelBase<FeatureInstanceDTO> {
    private String value;
    @ManyToOne
    private Feature feature;

}
