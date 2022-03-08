package com.santidev;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements Employee{

    private List<Employee> employeeList = new ArrayList<>();

    public void addEmployee(Employee employee){
        this.employeeList.add(employee);
    }

    public void removeEmployee(Employee employee){
        if (!this.employeeList.isEmpty()){
            this.employeeList.remove(employee);
        }else {
            System.out.println("Empty list... Can´t remove employee");

        }
    }


    @Override
    public void showEmployeeDetails() {
        for(Employee employee : employeeList ){
            employee.showEmployeeDetails();
        }
    }

}
