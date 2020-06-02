/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employee.employee.DAO;

import com.employee.employee.Model.Employee;
import java.util.List;
import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jos
 */
@Repository
public class EmployeeDAOimp  implements EmployeeDAO{
    @Autowired
 private EntityManager entityManager;

    @Override
    public List<Employee> get() {
        Session currSession= entityManager.unwrap(Session.class);
      Query<Employee> query = currSession.createQuery("from Employee", Employee.class);
        List<Employee> list = query.getResultList();
  return list;
    }

    @Override
    public Employee get(int id) {
       Session currSession= entityManager.unwrap(Session.class);
       Employee emp= currSession.get(Employee.class, id);
       return emp;
//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(Employee employee) {
        
        Session currSession= entityManager.unwrap(Session.class);
        currSession.saveOrUpdate(employee);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
         Session currSession= entityManager.unwrap(Session.class);
            Employee emp= currSession.get(Employee.class, id);
         currSession.delete(emp);//To change body of generated methods, choose Tools | Templates.
    }
    
}
