package com.pro.departiment.controllers;

import com.pro.departiment.entities.Department;
import com.pro.departiment.repositories.DepartmentRepository;
import com.pro.departiment.services.DepartmentService;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;

@RestController
@Slf4j
public class DepartmentController {
    private DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }
@PostMapping("/")
    public Department saveDepartment(@RequestBody Department dep) {

        log.info("Inside the save department");
        return departmentService.saveDepartment(dep);
    }
@GetMapping("/{departmentId}")
    public Department findDepartmentId(@PathVariable Long departmentId) {
        log.info("inside the department id method");
        return departmentService.findDepartmentById(departmentId);
    }
}
