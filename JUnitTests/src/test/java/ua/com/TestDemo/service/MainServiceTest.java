package ua.com.TestDemo.service;

import org.junit.Before;
import org.junit.Test;
import ua.com.TestDemo.model.EmployeeDetails;

import static org.junit.Assert.*;

/**
 * Created by EVA on 24.04.2017.
 */
public class MainServiceTest {

    private EmployeeDetails employee;
    private MainService service;
    @Before
    public void init(){
        employee = new EmployeeDetails();
        employee.setAge(12);
        employee.setMonthlySalary(10);
        employee.setName("kira");
        service = new MainService(employee);
    }

    @Test
    public void testCalculateYearlySalary() {

        assertEquals(120, service.yearSalary(employee), 0.0);
    }

    @Test
    public void calculateAppraisal() throws Exception {
        assertEquals(500, service.calculateAppraisal(employee), 0.0);

    }

}