package com.example.EmployeeManagementSystem.controller;

import com.example.EmployeeManagementSystem.model.Department;
import com.example.EmployeeManagementSystem.model.Employee;
import com.example.EmployeeManagementSystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private Department department;

    //Create
    @PostMapping("/add")
    public ResponseEntity<String> addEmployee(@RequestBody Employee employee, Department dept){
        Employee emp_obj = this.employeeService.emp_add(employee, dept);
        return ResponseEntity.status(HttpStatus.CREATED).body("Employee Created");
    }

    //Retreive
    @GetMapping("/get")
    public List<Employee> getEmployee(){
        return employeeService.getall();
    }

    //Update
    @PutMapping("/put/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id, String name){
        return new ResponseEntity<>(employeeService.emp_update(id, name),HttpStatus.OK);
    }

    //Delete
    @DeleteMapping(value = "/delete/{id}", produces = {"application/json"})
    public ResponseEntity<String> deleteEmployee(@PathVariable ("id") Long id){
        boolean status = this.employeeService.delete(id);
        if (status){
            return ResponseEntity.status(HttpStatus.ACCEPTED).body("Employee Deleted");
        }
        else{
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Employee Not Found");
        }
    }
}