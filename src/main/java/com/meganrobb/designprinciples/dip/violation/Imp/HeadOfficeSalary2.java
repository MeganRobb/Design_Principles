/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.designprinciples.dip.violation.Imp;

/**
 *
 * @author student
 */
public class HeadOfficeSalary2 {
    RetailSalary2 income;
    
    public void setSalary(RetailSalary2 t){
        income = t;
    }
    
    public double hoSalary()
      
    {
        double sal = income.salary(8)+2500;
        return sal;
    }
    
}
