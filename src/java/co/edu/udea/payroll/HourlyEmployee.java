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
public class HourlyEmployee extends Employee{
    
    private double wage;
    private double hours;

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
    
    public HourlyEmployee(){    }

    @Override
    public double payment() {

        if (this.getHours()<=40) {
            return this.getWage() * this.getHours();
        }else{
         return 40*this.getWage() +(this.getHours()-40)*this.getWage() * 1.5;
        }       
    }
}
