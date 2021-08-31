package com.sales.market.model;

import com.sales.market.dto.ExpenseDTO;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * @author arturo
 */
@Entity
public class Expense extends ModelBase<ExpenseDTO> {

    @Enumerated(EnumType.STRING)
    private ExpenseType expenseType;
    private Long value;
    private String description;
}
