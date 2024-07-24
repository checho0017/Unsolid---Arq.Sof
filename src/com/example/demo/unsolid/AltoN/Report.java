package com.example.demo.unsolid.AltoN;

import com.example.demo.unsolid.BajoN.EmployeeManager;

public class Report {
    IGenerateReport report;
    EmployeeManager employeeManager;

    Report(IGenerateReport report, EmployeeManager employeeManager)
    {
        this.report = report;
        this.employeeManager = employeeManager;
    }

    public void generateReport() {
        report.generateReport(employeeManager);
    }

    public void saveToFile(String name) {
        // Guardar en archivo
    }
}
