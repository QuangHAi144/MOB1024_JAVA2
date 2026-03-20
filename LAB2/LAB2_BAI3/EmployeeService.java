/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB2_BAI3;

import java.util.ArrayList;

/**
 *
 * @author QUANGHAI
 */
public class EmployeeService {
    private ArrayList<Employee> list = new ArrayList<Employee>();
    
    public void addEmployee(Employee e) {
        list.add(e);
    }

    public void displayAll() {
        for (Employee e : list) {
            System.out.println(e);
        }
    }

    public Employee findById(String id) {
        for (Employee e : list) {
            if (e.getId().equals(id)) {
                return e;
            }
        }
        return null;
    }

    public boolean updateSalary(String id, double newSalary) {
        Employee e = findById(id);
        if (e != null) {
            e.setSalary(newSalary);
            return true;
        }
        return false;
    }
}
