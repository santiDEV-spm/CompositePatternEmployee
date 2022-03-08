package com.santidev;

public class Main {

    public static void main(String[] args) {
	    Developer dev1 = new Developer(100, "Valentine Bailey", "Senior Developer");
        Developer dev2 = new Developer(101, "Suzanne Rachelle", "Junior Developer");

        CompanyDirectory engDirectory = new CompanyDirectory();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);

        Manager man1 = new Manager(200, "Oneida Carlisle", "SEO Manager");
        Manager man2 = new Manager(201, "Garrick Cantrell", "Manager");

        CompanyDirectory accDirectory = new CompanyDirectory();
        accDirectory.addEmployee(man1);
        accDirectory.addEmployee(man2);

        Designer designer1 = new Designer(301, "Jeremy Falconer", "Designer");
        Designer designer2 = new Designer(302, "Ashley Donalds", "Junior Designer");

        CompanyDirectory desDirectory = new CompanyDirectory();
        desDirectory.addEmployee(designer1);
        desDirectory.addEmployee(designer2);

        CompanyDirectory directory = new CompanyDirectory();
        directory.addEmployee(engDirectory);
        directory.addEmployee(accDirectory);
        directory.addEmployee(desDirectory);
        directory.showEmployeeDetails();


    }
}
