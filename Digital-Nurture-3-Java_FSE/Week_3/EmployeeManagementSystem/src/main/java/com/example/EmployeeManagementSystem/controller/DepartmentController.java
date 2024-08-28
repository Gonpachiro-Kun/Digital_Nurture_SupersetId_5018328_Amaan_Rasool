package com.example.EmployeeManagementSystem.controller;

import com.example.EmployeeManagementSystem.model.Department;
import com.example.EmployeeManagementSystem.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    // Create
    @PostMapping("/add")
    public ResponseEntity<String> addDepartment(@RequestBody Department department) {
    departmentService.dept_add(department);
        departmentService.dept_add(department);
        return ResponseEntity.status(HttpStatus.CREATED).body("Department Created");
    }

    // Retrieve all
    @GetMapping("/get")
    public ResponseEntity<List<Department>> getAllDepartments() {
        List<Department> departments = departmentService.getall();
//      List<Department> departments = departmentService.getAllDepartments();
        return ResponseEntity.status(HttpStatus.OK).body(departments);
    }

    // Retrieve by ID
    @GetMapping("/get/{id}")
    public ResponseEntity<Department> getDepartmentById(@PathVariable Long id) {
        Department department = departmentService.getDepartmentById(id);
//        Department department = departmentService.getDepartmentById(id);
        return department != null
                ? ResponseEntity.status(HttpStatus.OK).body(department)
                : ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

    // Update
    public boolean updateDepartment(Long id, Department updatedDepartment) {
        Optional<Department> existingDepartment = Optional.ofNullable(departmentService.getDepartmentById(id));
        if (existingDepartment.isPresent()) {
            Department department = existingDepartment.get();
            department.setName(updatedDepartment.getName()); // Update other fields if necessary
            return true;
        }
        return false;
    }

    // Delete
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteDepartment(@PathVariable Long id) {
        boolean isDeleted = departmentService.delete(id);
        return isDeleted
                ? ResponseEntity.status(HttpStatus.ACCEPTED).body("Department Deleted")
                : ResponseEntity.status(HttpStatus.NOT_FOUND).body("Department Not Found");
    }
}
