/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.designprinciples.dip.correction.Imp;

/**
 *
 * @author student
 */
public class HeadOfficeSalary {
    CalSalary income;
    
    public void setSalary(CalSalary t)
    {
        income = t;
    }
    
    public double hoSalary()
    {
        double sal = income.salary(8)+2500;
        return sal;
        
    }
}
