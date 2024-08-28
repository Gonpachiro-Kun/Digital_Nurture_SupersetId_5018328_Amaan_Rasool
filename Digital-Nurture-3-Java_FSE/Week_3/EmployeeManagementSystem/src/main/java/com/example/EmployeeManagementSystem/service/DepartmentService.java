package com.example.EmployeeManagementSystem.service;


import com.example.EmployeeManagementSystem.exception.EmployeeException;
import com.example.EmployeeManagementSystem.model.Department;
import com.example.EmployeeManagementSystem.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private Department department;

    @Autowired
    private DepartmentRepository departmentRepository;

    //get
    public List<Department> getall(){
        return departmentRepository.findAll();
    }

    //getbyid
    public Department getDepartmentById(Long id) {
        return departmentRepository.findById(id).orElse(null);
    }

    //create
    public Department dept_add(Department dept_name){
        return departmentRepository.save(dept_name);
    }

    //update
    public Department dept_update(Long dept_id, String dept_name){
        Department department = this.departmentRepository.findById(dept_id).orElse(null);
        if (department != null){
            department.setName(dept_name);
            this.departmentRepository.save(department);
            return department;
        }
        else{
            throw new EmployeeException("Department not found");
        }
    }

    //delete
    public boolean delete(Long id){
        boolean status = false;
        Department department = this.departmentRepository.findById(id).orElse(null);
        if (department != null){
            this.departmentRepository.delete(department);
            status = true;
        }
        return status;
    }
}
