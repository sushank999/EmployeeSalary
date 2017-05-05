/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ghimire.impl;

import com.ghimire.EmployeeDAO;
import com.ghimire.empl.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sushank
 */
public class EmployeeImpl implements EmployeeDAO{
    
    List<Employee> employees=new ArrayList<>();

    @Override
    public boolean insert(Employee employee) {
        return employees.add(employee);
    }

    @Override
    public List<Employee> getAll() {
        return employees;
    }

    @Override
    public Employee getbyCode(int code) {
        for(Employee employee:employees){
            if(employee.getCode()==code){
                return employee;
            }   
        }
        return null;
    }
    
}
