package com.sales.market.dto;

import com.sales.market.model.Expense;
import com.sales.market.model.ExpenseType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * @author arturo
 */
@Getter
@Setter
public class ExpenseDTO extends DTOBase<Expense> {

    private ExpenseType expenseType;
    private Long value;
    private String description;
}
