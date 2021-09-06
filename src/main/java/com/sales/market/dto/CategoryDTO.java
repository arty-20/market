package com.sales.market.dto;

import com.sales.market.exception.CheckedException;
import com.sales.market.exception.UncheckedException;
import com.sales.market.model.Category;
import lombok.Getter;
import lombok.Setter;

/**
 * @author arturo
 */
@Getter
@Setter
public class CategoryDTO extends DTOBase<Category> {
    private String name;
    private String code;

    private static final int MINIMO = 5;

    public void validateChecked() {
        if (code.length() < MINIMO) {
            throw new CheckedException();
        }
    }

    public void validateUnchecked() {
        if (code.length() < MINIMO) {
            throw new UncheckedException();
        }
    }

    public String completarCode(){
        int faltante = MINIMO - code.length();
        if (faltante > 0)
            return String.format("%" + MINIMO + "s", code).replace(' ', 'X');
        return code;
    }
}
