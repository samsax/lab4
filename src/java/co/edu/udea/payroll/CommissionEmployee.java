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
public class CommissionEmployee extends Employee{
    
    private double grossSales;
    private double commissionRate;

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
    
    public CommissionEmployee(){    }

    @Override
    public double payment() {

        return this.getCommissionRate() * this.getGrossSales();
    
    }
            
}
