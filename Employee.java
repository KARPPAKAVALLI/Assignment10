package com.assignment10;

public class Employee {
    //2. Create an Employee DTO class.
    // Create appropriate instance variables, static variables and methods with appropriate access modifiers.
    // Maintain encapsulation by giving controlled access to employee's PII.
    private String name;
    private float salary;
    private int empId;
    static int empCount=0;
    {
        empCount++;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public  void setEmpId(int empId) {
        this.empId=empId;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public int getEmpId() {
        return empId;
    }

    public static int getEmpCount() {
        return empCount;
    }
}
