package com.arslaner.kalıtım;

public class Employee {
    private String name;
    private String departmen;
    private int salary;

    public Employee(String name, String departmen, int salary) {
        this.name = name;
        this.departmen = departmen;
        this.salary = salary;
    }

    public void showInfos() {
        System.out.println("Bilgiler...");
        System.out.println("İsim: " + this.name);
        System.out.println("Departman: " + this.departmen);
        System.out.println("Maaş: " + this.salary);
    }
}
