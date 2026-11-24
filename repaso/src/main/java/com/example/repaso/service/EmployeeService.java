package com.example.repaso.service;

import com.example.repaso.model.Employee;
import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    List<Employee> findAll();

    Optional<Employee> findById(Long id);

    Employee save(Employee employee);

    Employee update(Long id, Employee employee);

    void deleteById(Long id);

}
