/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employee.employee.Service;

import com.employee.employee.DAO.EmployeeDAO;
import com.employee.employee.Model.Employee;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jos
 */
@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeDAO employedao;
@Transactional
    @Override
    public List<Employee> get() {
        return employedao.get(); //To change body of generated methods, choose Tools | Templates.
    }
@Transactional
    @Override
    public Employee get(int id) {
      return employedao.get(id);//To change body of generated methods, choose Tools | Templates.
    }
@Transactional
    @Override
    public void save(Employee employee) {
        employedao.save(employee); //To change body of generated methods, choose Tools | Templates.
    }
@Transactional
    @Override
    public void delete(int id) {
        employedao.delete(id); //To change body of generated methods, choose Tools | Templates.
    }
    
}
