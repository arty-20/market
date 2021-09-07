package com.sales.market.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.math.BigDecimal;

import static javax.persistence.GenerationType.IDENTITY;

/**
 * @author arturo
 */
@Getter
@Setter
@Entity
public class AccountAux extends ModelBase{

//    @Id
//    @GeneratedValue(strategy = IDENTITY)
//    private Long id;

    private BigDecimal totalDebit;

    private BigDecimal totalCredit;

    private BigDecimal balance;

    @Override
    public String toString() {
        return "AccountAux" + "\n" +
                "id: " + super.getId() + "\n" +
//                "id: " + id + "\n" +
                "totalDebit: " + totalDebit + "\n" +
                "totalCredit: " + totalCredit + "\n" +
                "balance: " + balance + "\n" ;
    }
}
