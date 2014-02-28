/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.meganrobb.designprinciples.dip.violation;

import com.meganrobb.designprinciples.config.SystemConfig;
import com.meganrobb.designprinciples.dip.correction.Imp.HeadOfficeSalary;
import com.meganrobb.designprinciples.dip.correction.Imp.RetailSalary;
import com.meganrobb.designprinciples.dip.violation.Imp.HeadOfficeSalary2;
import com.meganrobb.designprinciples.dip.violation.Imp.RetailSalary2;
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
public class DipViolationTest {

    private static HeadOfficeSalary2 hoSal2;
    private static RetailSalary2 reSal2;
    public DipViolationTest() {
    }
 
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void dipVioTest() {
        Assert.assertEquals(reSal2.salary(8), 5280.0);
        hoSal2.setSalary(reSal2);
        Assert.assertEquals(hoSal2.hoSalary(), 7780.0);
    }


@BeforeClass
    public static void setUpClass() throws Exception {
        ApplicationContext ctx1 = new AnnotationConfigApplicationContext(SystemConfig.class);
        reSal2 = (RetailSalary2)ctx1.getBean("dipV2");
        
        ApplicationContext ctx2 = new AnnotationConfigApplicationContext(SystemConfig.class);
        hoSal2 = (HeadOfficeSalary2)ctx2.getBean("dipV1");
 
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
