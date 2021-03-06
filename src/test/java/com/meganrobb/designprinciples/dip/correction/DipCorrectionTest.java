/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.designprinciples.dip.correction;

import com.meganrobb.designprinciples.config.SystemConfig;
import com.meganrobb.designprinciples.dip.correction.Imp.HeadOfficeSalary;
import com.meganrobb.designprinciples.dip.correction.Imp.RetailSalary;
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
public class DipCorrectionTest {
    private static HeadOfficeSalary hoSal;
    private static RetailSalary reSal;
    
    public DipCorrectionTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void dipCorrect() {
    Assert.assertEquals(reSal.salary(8),5280.0);
    hoSal.setSalary(reSal);
    Assert.assertEquals(hoSal.hoSalary(), 7780.0);}

    @BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx1 = new AnnotationConfigApplicationContext(SystemConfig.class);
        reSal = (RetailSalary)ctx1.getBean("dipC2");
        
        ApplicationContext ctx2 = new AnnotationConfigApplicationContext(SystemConfig.class);
        hoSal = (HeadOfficeSalary)ctx2.getBean("dipC1");
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
