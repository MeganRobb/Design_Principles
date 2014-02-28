/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.designprinciples.srp.violation.Impl;

/**
 *
 * @author student
 */
public interface EmployeesV {
    
    public String getEmpName();
    public String getEmpID();
    public String getEmpDes();
    public double getEmpSal();
    public String qShoeEmpReport(String empName, String empID,String empDes);
    
    
}
