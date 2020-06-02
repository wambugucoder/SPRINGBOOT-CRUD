/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employee.employee.DAO;

import com.employee.employee.Model.Employee;
import java.util.List;

/**
 *
 * @author Jos
 */
public interface EmployeeDAO {
    List<Employee>get();
  Employee get(int id);
  void save(Employee employee);
  void delete(int id);
  
    
}
