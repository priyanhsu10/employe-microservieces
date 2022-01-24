package com.pro.departiment.services;

import com.pro.departiment.entities.Department;
import com.pro.departiment.repositories.DepartmentRepository;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    private DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    public Department saveDepartment(Department dep) {
        return departmentRepository.save(dep);
    }

    public Department findDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId).orElseThrow(() -> new RuntimeException("Department is not found"));
    }
}
