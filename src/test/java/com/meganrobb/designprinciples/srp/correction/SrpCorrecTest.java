/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.designprinciples.srp.correction;

import com.meganrobb.designprinciples.config.SystemConfig;
import com.meganrobb.designprinciples.polymorphisim.SupplierPoly;
import com.meganrobb.designprinciples.srp.correction.Imp.EmployeeReport;
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
public class SrpCorrecTest {
    
    private static EmployeeReport repo;
    
    public SrpCorrecTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void empRepo() {
    repo.qShoeEmpReport("Megan", "RBB1234", "HR Manager");
    Assert.assertEquals(repo.qShoeEmpReport("Megan", "RBB1234", "HR Manager"),repo.qShoeEmpReport("Megan", "RBB1234", "HR Manager"));}

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SystemConfig.class);
        repo = (EmployeeReport)ctx.getBean("srpC");
        
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
