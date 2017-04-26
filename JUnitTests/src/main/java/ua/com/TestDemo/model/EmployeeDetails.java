package ua.com.TestDemo.model;

/**
 * Created by EVA on 24.04.2017.
 */
public class EmployeeDetails {

    private String name;
    private double monthlySalary;
    private int age;

    public EmployeeDetails(String name, double monthlySalary, int age) {
        this.name = name;
        this.monthlySalary = monthlySalary;
        this.age = age;
    }

    public EmployeeDetails() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
