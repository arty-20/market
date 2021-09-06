package com.sales.market.dto;

import com.sales.market.exception.CheckedException;
import com.sales.market.exception.UncheckedException;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CategoryDTOTest {

    @Test
    public void givenCategoryDTOWithCodeLengthLessThanMinimumSizeWhenCategoryDTO_validateThenCheckedErrorShouldBeCatchAndYouShouldRecoverWithTrailingXCharacters(){
        boolean flag = false;
        CategoryDTO dto = new CategoryDTO();
        dto.setCode("aaa");
        String afterCode = dto.getCode();
        try {
            dto.validateChecked();
            flag = true;
        }catch (CheckedException e){
            try {
                afterCode = dto.completarCode();
                System.out.println(afterCode);
                flag = true;
            }catch (CheckedException c){

            }
        }

        assertTrue(flag);
        assertTrue(afterCode.length() >= 5);
    }

    @Test(expectedExceptions= UncheckedException.class)
    public void givenCategoryDTOWithCodeLengthLessThanMinimumSizeWhenCategoryDTO_validateUncheckedThenUncheckedErrorShouldBeThrown(){
        CategoryDTO dto = new CategoryDTO();
        dto.setCode("aaa");
        dto.validateChecked();
        assertEquals(dto.getCode().length(), 3);
    }

}