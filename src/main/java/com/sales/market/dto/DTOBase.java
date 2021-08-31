package com.sales.market.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sales.market.model.ModelBase;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author arturo
 */
@Getter
@Setter
public class DTOBase <E extends ModelBase> {

        private Long id;

        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
        private Date createdOn;

        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
        private Date updatedOn;

        private long version;
}
