/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.designprinciples.srp.violation;

import com.meganrobb.designprinciples.config.SystemConfig;
import com.meganrobb.designprinciples.srp.correction.Imp.EmployeeReport;
import com.meganrobb.designprinciples.srp.violation.Impl.EmployeeImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author student
 */
public class SrpVioTest {
    
    private static EmployeeImp report;
    public SrpVioTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void empRepo() {
    report.qShoeEmpReport("Tracy", "RBB5678", "Buyers Assistant");
    Assert.assertEquals(report.qShoeEmpReport("Tracy", "RBB5678", "Buyers Assistant"), report.qShoeEmpReport("Tracy", "RBB5678", "Buyers Assistant"));}

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SystemConfig.class);
        report = (EmployeeImp)ctx.getBean("srpV");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
