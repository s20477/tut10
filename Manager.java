package com.company;

public class Manager extends Employee {

    public int bonus;

    public Manager(String firstName, String lastName, int birthdayYear, int hireDate, String companyName, int salary, int bonus) {
        super(firstName, lastName, birthdayYear, hireDate, companyName, salary);
        this.bonus = bonus;
    }

    @Override
    public int getSalary() {
        return super.getSalary();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

