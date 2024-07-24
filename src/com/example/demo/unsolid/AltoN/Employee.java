package com.example.demo.unsolid.AltoN;

final public class Employee {

    String name;
    String departament;
    boolean partTime;

    public Employee(String name, String departament, boolean partTime )
    {
        this.name = name;
        this.departament = departament;
        this.partTime = partTime;
    }

    public String getName() {
        return name;
    }

    public String getDepartament() {
        return departament;
    }
}
