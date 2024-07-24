package com.example.demo.unsolid.AltoN;

import com.example.demo.unsolid.BajoN.EmployeeManager;

public class SalaryCalculator {

    EmployeeManager employeeManager;

    SalaryCalculator(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }

    public double calculateSalary(String name) {
        return employeeManager.calculateSalary(name);
    }
}
