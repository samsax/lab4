/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.payroll;

/**
 *
 * @author davida.florez
 */
public class SalariedEmployee extends Employee{
    
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    

    @Override
    public double payment() {
        return getSalary();
    }
    
}
