package com.example.demo.unsolid.AltoN;

import com.example.demo.unsolid.BajoN.EmployeeManager;
import com.example.demo.unsolid.BajoN.ExcelImpl;

public class main {
    public static void main(String[] args) {

        //Instanciar empleado
        Employee uno = new Employee("Sergio","Ant", false);
        ExcelImpl excel = new ExcelImpl();
        EmployeeManager manager = new EmployeeManager();

        manager.calculateSalary("S1234");
        //Generar reporte
        generateReport(excel,manager);

        //Calcular salario
        calculateSalary(manager);

        System.out.println(uno);

    }

    public static void generateReport(IGenerateReport generateReport, EmployeeManager manager) {
        Report reporte = new Report(generateReport, manager);
        reporte.saveToFile("S1234");
        reporte.generateReport();
    }

    public static void calculateSalary(EmployeeManager manager) {
        SalaryCalculator salaryCalculator = new SalaryCalculator(manager);
        salaryCalculator.calculateSalary("Sergio");
    }

}
