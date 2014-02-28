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
public class RetailSalary implements CalSalary {
    public double salary(double hours)
    {
        double salary = (hours * 22)*30;
        return salary;
        
    }
    
}
