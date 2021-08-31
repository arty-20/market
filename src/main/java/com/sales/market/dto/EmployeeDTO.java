package com.sales.market.dto;

import com.sales.market.model.Employee;
import lombok.Getter;
import lombok.Setter;

/**
 * @author arturo
 */
@Getter
@Setter
public class EmployeeDTO extends DTOBase<Employee> {
        private String firstName;
        private String lastName;
        private Byte[] image;
}
