package ua.com.TestDemo.service;

import ua.com.TestDemo.model.EmployeeDetails;

/**
 * Created by EVA on 24.04.2017.
 */
public class MainService {

    private EmployeeDetails employeeDetails;

    public MainService(EmployeeDetails employeeDetails) {
        this.employeeDetails = employeeDetails;
    }

    public double yearSalary(EmployeeDetails employeeDetails){
        return this.employeeDetails.getMonthlySalary() * 12;
    }

    public double calculateAppraisal(EmployeeDetails employee) {
        double appraisal = 0;

        if(employeeDetails.getMonthlySalary() < 10000){
            appraisal = 500;
        }else{
            appraisal = 1000;
        }

        return appraisal;
    }



}
