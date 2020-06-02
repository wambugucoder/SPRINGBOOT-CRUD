/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employee.employee.Service;

import com.employee.employee.Model.Employee;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jos
 */

public interface EmployeeService {
      List<Employee>get();
  Employee get(int id);
  void save(Employee employee);
  void delete(int id);
    
}
