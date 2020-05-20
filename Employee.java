package com.company;

public class Employee extends Person {

    public int hireDate;
    public String companyName;
    public int salary;
    public int bonus;

    public Employee(String firstName, String lastName, int birthdayYear, int hireDate, String companyName, int salary) {
        super(firstName, lastName, birthdayYear);
        this.hireDate = hireDate;
        this.companyName = companyName;
        this.salary = salary;
    }

    @Override
    public int getAge() {
    return 2020 - birthdayYear;
    }

    public int getJobSeniority() {
        return 2020 - hireDate;
    }

    public int getSalary() {
        return salary + bonus;
    }
}
