/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ghimire;

import com.ghimire.empl.Employee;
import java.util.List;

/**
 *
 * @author Sushank
 */
public interface EmployeeDAO {
    boolean insert(Employee employees);
    List<Employee> getAll();
    Employee getbyCode(int code);
    
}
