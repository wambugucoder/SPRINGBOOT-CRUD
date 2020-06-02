/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.employee.employee.Controller;

import com.employee.employee.Model.Employee;
import com.employee.employee.Service.EmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jos
 */
@RestController
@RequestMapping("/api")
public class EmployeeController {
     @Autowired
 private EmployeeService employeeService;
     
      @GetMapping("/employee")
 public List<Employee> get(){
  return employeeService.get();
 }
 
  @PostMapping("/employee")
  public Employee save(@RequestBody Employee employee){
  employeeService.save(employee);
  return employee;
  }
   @GetMapping("/employee/{id}")
           public Employee get(@PathVariable int id){
              return employeeService.get(id);
               
           
           }
           @DeleteMapping("/employee/{id}")
 public String delete(@PathVariable int id) {
  
  employeeService.delete(id);
  
  return "Employee removed with id "+id;
  
 }
 
 @PutMapping("/employee")
 public Employee update(@RequestBody Employee employee) {
  employeeService.save(employee);
  return employee;
 }
}
