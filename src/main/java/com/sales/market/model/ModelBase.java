package com.sales.market.model;

import com.sales.market.dto.DTOBase;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * @author arturo
 */
@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class ModelBase<D extends DTOBase> {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column( nullable = false, updatable = false)
    private Date createdOn;

    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(insertable = false)
    private Date updatedOn;

    @Version
    @Column(nullable = false)
    private long version;
}
