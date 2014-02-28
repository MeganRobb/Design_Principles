/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.designprinciples.srp.correction.Imp;

/**
 *
 * @author student
 */
public class EmployeeReport implements Employees {
    
    private String empName;
    private String empID;
    private String empDes;
    private double empSal;

    public String getEmpName() {
        return empName;
         
    }

    public String getEmpID() {
        return empID;
    }

    public String getEmpDes() {
        return empDes;
    }

    public double getEmpSal() {
        return empSal;
    }

  
    public String qShoeEmpReport(String empName, String empID, String empDes) {
        return "Employee Name: "+empName+"\n Employee ID: "+empID+"\n Employee Description: "+empDes+"\n"; 
        
    }
    
    
}
