package com.example.EmployeeManagementSystem.service;

import com.example.EmployeeManagementSystem.model.Department;
import com.example.EmployeeManagementSystem.model.Employee;
import com.example.EmployeeManagementSystem.exception.EmployeeException;
import com.example.EmployeeManagementSystem.repository.DepartmentRepository;
import com.example.EmployeeManagementSystem.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private Employee employee;

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    //get
    public List<Employee> getall(){
        return employeeRepository.findAll();
    }

    //create
    @Transactional
    public Employee emp_add(Employee emp, Department dept){
        // Save the department first
        Department savedDepartment = departmentRepository.save(dept);

        // Set the saved department to the employee
        emp.setDepartment(savedDepartment);

        // Save the employee
        return employeeRepository.save(emp);
    }

    //update
    public Employee emp_update(Long id, String name){
        Employee employee = this.employeeRepository.findById(id).orElse(null);
        if (employee != null){
            employee.setName(name);
            this.employeeRepository.save(employee);
            return employee;
        }
        else{
            throw new EmployeeException("Employee not found");
        }
    }

    //delete
    public boolean delete(Long id){
        boolean status = false;
        Employee employee = this.employeeRepository.findById(id).orElse(null);
        if (employee != null){
            this.employeeRepository.delete(employee);
            status = true;
        }
        return status;
    }
}